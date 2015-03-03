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
public class DoubleLinkedListFirstNode<E> extends Node {

    public DoubleLinkedListFirstNode()
    {
        data = new FirstNodeData();
    }
    
    @Override
    public int compareTo(Object t) {
        return -1;
    }
    
    @Override
    public String toString()
    {
        return "";
    }
    
    class FirstNodeData implements Comparable
    {
        @Override
        public int compareTo(Object t)
        {
            return -1;
        }
    }
}
