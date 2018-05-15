package com.impte.algorithms.graph;

import java.util.Iterator;
public class Stack <Value> implements Iterable<Value> {

    private int size;
    private Node<Value> bottom = new Node<>(null);
    private Node<Value> top;

    private class Node<V>{
        private V value;
        private Node<V> next;

        Node(V value){
            this.value = value;
        }
    }

    public Stack(){
        this.top = bottom;
    }

    public void push(Value value){
        if (size == 0){
            bottom.value = value;
        }else {
            Node<Value> node = new Node<>(value);
            node.next = top;
            top = node;
        }
        size++;
    }

    public Value pop(){
        if (size > 0){
            Value value = top.value;
            top = top.next;
            size--;
            return value;
        }else {
            return null;
        }
    }

    @Override
    public Iterator<Value> iterator() {
        return new stackIterator();
    }

    private class stackIterator implements Iterator<Value>{
        private int index;
        private Node<Value> now = top;

        @Override
        public boolean hasNext() {
            return index != size;
        }

        @Override
        public Value next() {
            if (index < size){
                Value value = now.value;
                index++;
                now = now.next;
                return value;
            }else {
                return null;
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder strB = new StringBuilder();
        strB.append("[");
        Node<Value> now = top;
        while (now != null){
            if (now == top){
                strB.append(now.value);
            }else {
                strB.append(", ");
                strB.append(now.value);
            }
            now = now.next;
        }
        strB.append("]");
        return strB.toString();
    }
}
