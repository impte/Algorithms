package com.impte.algorithms.test;

import com.impte.algorithms.graph.Digarph;
import com.impte.algorithms.graph.DirectedDFS;
import com.impte.algorithms.graph.In;

import java.io.IOException;

public class DirectedDFSTest {
    public static void main(String[] args) throws IOException {
        In in = new In("C:\\Users\\xutong\\Desktop\\test txt\\ddfs.txt");
        Digarph G = new Digarph(in);
        for (int v=0; v< G.V(); v++){
            DirectedDFS ddfs = new DirectedDFS(G, v);
            System.out.println("点 "+ v + " 可达的点有：");
            for (int w=0; w< G.V(); w++){
                if (ddfs.marked(w) && w != v){
                    System.out.print(w + "  ");
                }
            }
            System.out.println();
        }
    }
}
