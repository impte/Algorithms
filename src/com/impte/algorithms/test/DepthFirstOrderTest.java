package com.impte.algorithms.test;

import com.impte.algorithms.graph.DepthFirstOrder;
import com.impte.algorithms.graph.Digarph;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class DepthFirstOrderTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\test txt\\ddfs3.txt");
        Digarph G = new Digarph(in);
        DepthFirstOrder dfo = new DepthFirstOrder(G);
        System.out.println(dfo.pre());
        System.out.println(dfo.post());
        System.out.println(dfo.reversePost());
    }
}
