/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Christopher
 * @param <E>
 */
public class Node<E> implements Comparable{
    protected E data;
    protected Node<E> next;
    protected Node<E> previous;

    public Node()
    {
        data = null;
        next = null;
        previous = null;
    }
    public Node(E data)
    {
        this.data = data;
        next = null;
        previous = null;
    }
    
    public E data()
    {
        return this.data;
    }
    public void data(E value)
    {
        this.data = value;
    }
    
    public Node<E> next()
    {
        return this.next;
    }
    public void next(Node<E> value)
    {
        this.next = value;
    }
    
    public Node<E> previous()
    {
        return this.previous;
    }
    public void previous(Node<E> value)
    {
        this.previous = value;
    }
    
    public void add(Node<E> awfullyNamedNode)
    {
        Comparable otherData = (Comparable)awfullyNamedNode.data();
        Comparable thisData = (Comparable)this.data;
        int result = thisData.compareTo(otherData);
        if(result <= 0)
        {
            if(next == null)
            {
                this.next = awfullyNamedNode;
                awfullyNamedNode.previous(this);
            }
            else
            {
                next.add(awfullyNamedNode);
            }
        }
        else
        {
            awfullyNamedNode.next(this);
            awfullyNamedNode.previous(this.previous);
            this.previous = awfullyNamedNode;
            if(awfullyNamedNode.previous() != null)
            {
                awfullyNamedNode.previous().next(awfullyNamedNode);
            }
        }
        
    }
    
    @Override
    public int compareTo(Object t) {
        Node<E> anotherNode = (Node<E>)t;
        Comparable otherData = (Comparable)anotherNode.data();
        Comparable thisData = (Comparable)this.data;
        return thisData.compareTo(otherData);
    }
    
    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append(data.toString());
        if(next != null)
        {
            s.append(", ");
        }
        return s.toString();
    }
}