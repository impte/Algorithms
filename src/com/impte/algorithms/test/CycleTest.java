package com.impte.algorithms.test;

import com.impte.algorithms.graph.Cycle;
import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class CycleTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\xxxx.txt");
        Graph G = new Graph(in);
        Cycle cycle = new Cycle(G);
        System.out.println(cycle.hasCycle());
    }
}
