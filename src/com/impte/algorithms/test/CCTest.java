package com.impte.algorithms.test;

import com.impte.algorithms.graph.CC;
import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class CCTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\xxxx.txt");
        Graph graph = new Graph(in);
        CC cc = new CC(graph);
        System.out.println(cc.count());
        System.out.println(cc.id(7));
    }
}
