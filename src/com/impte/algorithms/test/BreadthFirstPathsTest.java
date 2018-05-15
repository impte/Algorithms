package com.impte.algorithms.test;

import com.impte.algorithms.graph.BreadthFirstPaths;
import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class BreadthFirstPathsTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\xxxx.txt");
        Graph graph = new Graph(in);
        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);
        for (Integer w: bfp.pathTo(3)){
            System.out.println(w);
        }
    }
}
