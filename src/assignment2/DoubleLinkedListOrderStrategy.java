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
public interface DoubleLinkedListOrderStrategy<E> {
    
    Node firstNode();
    
    Node lastNode();
    
    boolean addItem(Node<E> first, Node<E> added);
    
}
