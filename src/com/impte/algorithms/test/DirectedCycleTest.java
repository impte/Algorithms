package com.impte.algorithms.test;

import com.impte.algorithms.graph.Digarph;
import com.impte.algorithms.graph.DirectedCycle;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class DirectedCycleTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\test txt\\ddfs2.txt");
        Digarph G = new Digarph(in);
        DirectedCycle dc = new DirectedCycle(G);
        System.out.println(dc.cycle());
    }
}
