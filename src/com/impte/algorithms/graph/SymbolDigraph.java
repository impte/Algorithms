package com.impte.algorithms.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class SymbolDigraph {
    private HashMap<String, Integer> map;
    private String[] keys;
    private Digarph G;

    public SymbolDigraph(String path, String sp) throws IOException {
        map = new HashMap<>();

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while (line != null){
            String[] a = line.split(sp);
            for (String anA : a) {
                if (!map.containsKey(anA)){
                    map.put(anA, map.size());
                }
            }
            line = br.readLine();
        }

        keys = new String[map.size()];
        for (String name: map.keySet()){
            keys[map.get(name)] = name;
        }

        G = new Digarph(map.size());
        fr = new FileReader(path);
        br = new BufferedReader(fr);

        line = br.readLine();
        while (line != null){
            String[] a = line.split(sp);
            int v = map.get(a[0]);
            for (int i=1; i<a.length; i++){
                G.addEdge(v, map.get(a[i]));
            }
            line = br.readLine();
        }
    }

    public boolean contains(String s){
        return map.containsKey(s);
    }

    public int index(String s){
        return map.get(s);
    }

    public String name(int index){
        return keys[index];
    }

    public Digarph G(){
        return G;
    }
}
