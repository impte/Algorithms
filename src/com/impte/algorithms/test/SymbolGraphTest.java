package com.impte.algorithms.test;

import com.impte.algorithms.graph.Graph;
import com.impte.algorithms.graph.SymbolGraph;

import java.io.IOException;

public class SymbolGraphTest {
    public static void main(String[] args) throws IOException {
        SymbolGraph sg = new SymbolGraph("C:\\Users\\xutong\\Desktop\\xxxx.txt", " ");
        Graph G = sg.G();

        for (int v=0; v<G.V(); v++){
            System.out.println(sg.name(v));
            for (int w: G.adj(v)){
                System.out.println("  " + sg.name(w));
            }
        }
    }
}
