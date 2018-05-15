package com.impte.algorithms.graph;

public class DirectedDFS {
    private boolean[] marked;

    public DirectedDFS(Digarph G, int s){
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    public DirectedDFS(Digarph G, Iterable<Integer> sources){
        marked = new boolean[G.V()];
        for (int s: sources){
            if (!marked[s]) dfs(G, s);
        }
    }

    private void dfs(Digarph G, int v){
        marked[v] = true;
        for (int w: G.adj(v)){
            if (!marked[w]) dfs(G, w);
        }
    }

    public boolean marked(int v){
        return marked[v];
    }
}
