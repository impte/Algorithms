package com.impte.algorithms.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class SymbolGraph {
    private HashMap<String, Integer> st;
    private String[] keys;
    private Graph G;

    public SymbolGraph(String path, String sp) throws IOException {
        st = new HashMap<>();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null){
            String[] a = line.split(sp);
            for (String anA : a) {
                if (!st.containsKey(anA)) {
                    st.put(anA, st.size());
                }
            }
            line = br.readLine();
        }

        keys = new String[st.size()];
        for (String name: st.keySet()){
            keys[st.get(name)] = name;
        }

        G = new Graph(st.size());

        fr = new FileReader(path);
        br = new BufferedReader(fr);
        line = br.readLine();
        while (line != null){
            String[] a = line.split(sp);
            int v = st.get(a[0]);
            for (int i=1; i<a.length; i++){
                G.addEdge(v, st.get(a[i]));
            }
            line = br.readLine();
        }
    }

    public boolean contains(String s){
        return st.containsKey(s);
    }

    public int index(String s){
        return st.get(s);
    }

    public String name(int v){
        return keys[v];
    }

    public Graph G(){
        return G;
    }
}
