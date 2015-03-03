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
    public boolean addItem(Node<E> first, Node<E> added) {
        boolean itemAdded = false;
        while(itemAdded == false && first.next() != null)
        {
            if(first.compareTo(added) > 0)
            {
                first = first.next();
            }
            else
            {
                added.next(first);
                if(first.previous() != null)
                {
                    added.previous(first.previous());
                    added.previous().next(added);
                }
                first.previous(added);
                itemAdded = true;
            }
        }
        if(first.next() == null)
        {
            if(first.compareTo(added) > 0)
            {
                first.next(added);
                added.previous(first);
            }
            else
            {
                added.next(first);
                if(first.previous() != null)
                {
                    added.previous(first.previous());
                    added.previous().next(added);
                }
                first.previous(added);
            }
        }
        return true;
    }    
}
