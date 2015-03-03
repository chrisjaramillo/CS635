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
public class DoubleLinkedListDecreasingOrderStrategy<E> implements DoubleLinkedListOrderStrategy<E>{
    @Override
    public Node firstNode()
    {
        return new DoubleLinkedListLastNode<>();
    }
    
    @Override
    public Node lastNode()
    {
        return new DoubleLinkedListFirstNode<>();
    }
    
    @Override
    public boolean addItem(Node<E> first, Node<E> added) {
        Node currentItem = first;
        while(currentItem.compareTo(added) > 0)
        {
            currentItem = currentItem.next();
        }
        added.add(currentItem.previous(), currentItem);
        return true;
    }    
}
