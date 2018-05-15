package com.impte.algorithms.test;

import com.impte.algorithms.graph.DepthFirstPaths;
import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.In;

import java.io.IOException;
import java.util.Iterator;
import java.util.stream.Stream;

public class DepthFirstPathsTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\xxxx.txt");
        Graph graph = new Graph(in);
        DepthFirstPaths dfp = new DepthFirstPaths(graph, 0);
        Iterator<Integer> its = dfp.pathTo(2).iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
    }
}
