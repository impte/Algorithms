package com.impte.algorithms.test;

import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.In;
import com.impte.algorithms.graph.TwoColor;

import java.io.IOException;

public class TwoColorTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\xxxx.txt");
        Graph graph = new Graph(in);
        TwoColor tc = new TwoColor(graph);
        System.out.println(tc.isBipartite());
    }
}
