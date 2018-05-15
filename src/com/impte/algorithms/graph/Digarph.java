package com.impte.algorithms.graph;

public class Digarph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Digarph(int V){
        this.V = V;
        this.E = 0;
        adj = new Bag[V];
        for (int v=0; v<V; v++){
            adj[v] = new Bag<>();
        }
    }

    public Digarph(In in) {
        this(in.readInt());
        int E = in.readInt();
        for (int i=0; i<E; i++){
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
    
    public Digarph reverse(){
        Digarph R = new Digarph(V);
        for (int v=0; v<V; v++){
            for (int w: adj[v]){
                R.addEdge(w, v);
            }
        }
        return R;
    }
}
