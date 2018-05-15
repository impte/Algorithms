package com.impte.algorithms.graph;

public class Queue<Value> {

    private Node<Value> head;
    private Node<Value> tail;
    private int length;

    private class Node<V>{
        private V value;
        private Node<V> next;
        private Node<V> front;

        Node(V value) {
            this.value = value;
        }
    }

    public void enqueue(Value value){
        if (isEmpty()){
            head = new Node<>(value);
            tail = head;
            length++;
            return;
        }
        Node<Value> node = new Node<>(value);
        node.next = tail;
        tail.front = node;
        tail = node;
        length++;
    }

    public Value dequeue(){
        if (isEmpty()) return null;
        Value value = head.value;
        head = head.front;
        if (head != null) head.next = null;
        length--;
        return value;
    }

    public int getSize(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }
}
