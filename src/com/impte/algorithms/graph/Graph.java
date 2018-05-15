package com.impte.algorithms.graph;

public class Graph {
    private final int V;        //顶点数
    private int E;              //边数
    private Link<Integer>[] adj; //领接表

    public Graph(int V){
        this.V = V;
        adj = new Link[V];
        for (int v = 0; v < V; v++){
            adj[v] = new Link<Integer>();
        }
    }

    public Graph(In in) {
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
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}
