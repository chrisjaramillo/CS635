/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Christopher
 */

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class DoubleLinkedList<E> implements Deque<E>{
    private Node<E> first;
    private Node<E> last;
    private int count;
    private DoubleLinkedListOrderStrategy<E> orderStrategy;
    
    public DoubleLinkedList(DoubleLinkedListOrderStrategy<E> strategy)
    {
        this.orderStrategy = strategy;
        this.first = strategy.firstNode();
        this.last = strategy.lastNode();
        first.next(last);
        last.previous(first);
        this.count = 0;
    }

    @Override
    public void addFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offerFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offerLast(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pollFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pollLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        E firstData = null;
        if(first != null)
        {
            firstData = first.data();
            first = first.next();
            count --;
        }
        return firstData;
    }

    @Override
    public E getLast() {
        E lastData = null;
        if(last != null)
        {
            lastData = last.data();
            last = last.previous();
            count--;
        }
        return lastData;
    }

    @Override
    public E peekFirst() {
        E firstData = null;
        if(first != null)
        {
            firstData = first.data();
        }
        return firstData;
    }

    @Override
    public E peekLast() {
        E lastData = null;
        if(last != null)
        {
            lastData = last.data();
        }
        return lastData;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(E e) {
        if(e == null)
        {
            return false;
        }
        Node<E> newNode = new Node(e);
        /*if(count == 0)
        {
            first = last = newNode;
        }
        else
        {*/
            orderStrategy.addItem(first, newNode);
        //}
        count++;
        
        /*if(first.previous() != null)
        {
            first = newNode;
        }
        if(last.next() != null)
        {
            last = newNode;
        }*/
        return true;
    }

    @Override
    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoubleLinkedListIterator(this, first);
    }

    @Override
    public Iterator<E> descendingIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Object[] toArray() {
        Object[] thisAsArray = new Object[count];
        Node<E> currentNode = first;
        for(int i=0; i < count; i++)
        {
            thisAsArray[i] = (Object)currentNode.data();
        }
        return thisAsArray;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node aNode = first;
        while(aNode != null)
        {
            s.append(aNode.toString());
            aNode = aNode.next();
        }
        return s.toString();
    }
}
