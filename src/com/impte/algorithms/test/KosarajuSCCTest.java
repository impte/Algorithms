package com.impte.algorithms.test;

import com.impte.algorithms.graph.Digarph;
import com.impte.algorithms.graph.In;
import com.impte.algorithms.graph.KosarajuSCC;

import java.io.IOException;

public class KosarajuSCCTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\test\\KosarajuSCC.txt");
        Digarph G = new Digarph(in);
        KosarajuSCC kscc = new KosarajuSCC(G);
        System.out.println(kscc.count());
    }
}
