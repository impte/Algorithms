package com.impte.algorithms.test;

import com.impte.algorithms.graph.SymbolDigraph;
import com.impte.algorithms.graph.Topological;

import java.io.IOException;

public class TopologicalTest {
    public static void main(String[] args) throws IOException {
        SymbolDigraph sd = new SymbolDigraph("C:\\Users\\xutong\\Desktop\\test\\ddfs3.txt", " ");
        Topological topological = new Topological(sd.G());
        System.out.println(topological.order());
    }
}
