package com.impte.algorithms.graph;

import java.util.Iterator;

public class Queue<Value> implements Iterable<Value> {

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

    @Override
    public Iterator<Value> iterator() {
        return new queueIterator();
    }

    private class queueIterator implements Iterator<Value>{

        private int index;
        private Node<Value> now = head;

        @Override
        public boolean hasNext() {
            return index != length;
        }

        @Override
        public Value next() {
            if (index < length){
                Value value = now.value;
                now = now.next;
                index++;
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
        Node<Value> now = head;
        while (now != null){
            if (now == head){
                strB.append(now.value);
            }else {
                strB.append(", ");
                strB.append(now.value);
            }
            now = now.front;
        }
        strB.append("]");
        return strB.toString();
    }
}
