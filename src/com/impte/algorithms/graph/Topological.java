package com.impte.algorithms.graph;

public class Topological {
    private Iterable<Integer> order;

    public Topological(Digarph G){
        DirectedCycle cycleFineder = new DirectedCycle(G);
        if (!cycleFineder.hasCycle()){
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
    }

    public Iterable<Integer> order(){
        return order;
    }

    public boolean isDAG(){
        return order == null;
    }
}
