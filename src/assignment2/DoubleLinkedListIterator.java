/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Iterator;
/**
 *
 * @author Christopher
 */

/**
 *
 * @author Christopher
 * @param <E>
 */
public class DoubleLinkedListIterator<E> implements Iterator<E>{

    private DoubleLinkedList<E> aList;
    private Node<E> currentNode;
    private int current;
    
    DoubleLinkedListIterator(DoubleLinkedList<E> aList, Node<E> front)
    {
        this.aList = aList;
        this.current = 0;
        this.currentNode = front;
    }
    @Override
    public boolean hasNext() {
        return current < aList.size();
    }

    @Override
    public E next() {
        return this.currentNode.next().data();
    }
    
}
