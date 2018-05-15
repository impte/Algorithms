package com.impte.algorithms.graph;

import java.util.Iterator;

public class Link<Value> implements Iterable<Value> {
    //链表长度
    private int length;
    //头结点
    private Node<Value> head = new Node<>(null);

    //节点
    private class Node<V>{
        private V value;
        private Node<V> next;

        Node(V value) {
            this.value = value;
        }
    }

    public void add(Value value){
        Node<Value> node = new Node<>(value);
        Node now = head;
        while (now.next != null) now = now.next;
        now.next = node;
        length++;
    }

    @Override
    public Iterator<Value> iterator() {
        return new LinkIterator();
    }

    private class LinkIterator implements Iterator<Value>{

        private int index = 0;
        private Node<Value> now = head;

        @Override
        public boolean hasNext() {
            return index != length;
        }

        @Override
        public Value next() {
            if (index++ < length){
                now = now.next;
                return now.value;
            }else {
                return null;
            }
        }
    }
}
