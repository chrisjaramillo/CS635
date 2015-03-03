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
public class DoubleLinkedListIncreasingOrderStrategy<E> implements DoubleLinkedListOrderStrategy<E>{

    @Override
    public boolean addItem(Node<E> currentItem, Node<E> added) 
    {
        while(currentItem.compareTo(added) < 0)
        {
            currentItem = currentItem.next();
        }
        added.next(currentItem);
        added.previous(currentItem.previous());
        added.previous().next(added);
        currentItem.previous(added);
        return true;
    }

    @Override
    public Node firstNode() {
        return new DoubleLinkedListFirstNode<>();
    }

    @Override
    public Node lastNode() {
        return new DoubleLinkedListLastNode<>();
    }
}
