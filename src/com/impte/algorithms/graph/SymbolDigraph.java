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
            line
        }
    }
}
