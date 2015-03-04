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
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> list = new DoubleLinkedList<>(strategy);
        OnProbationDecorator decorator = new OnProbationDecorator(list);
        Student student = new Student("Albert", "9302832", 3.5);
        Student student1 = new Student("Ben", "8383", 2.5);
        Student student2 = new Student("Chris", "09302", 1.5);
        Student student3 = new Student("Don", "5563", 0.5);
        Student student4 = new Student("Hafed", "8983", 4.0);
        /*list.add(student);
        list.add(student3);
        list.add(student2);
        list.add(student1);
        list.add(student4);*/
        decorator.add(student);
        decorator.add(student3);
        decorator.add(student2);
        decorator.add(student1);
        decorator.add(student4);
        System.out.println(list);
        System.out.println(decorator);
        Iterator myIter = list.iterator();
        
        
        OnProbationFilter probationFilter = new OnProbationFilter(list.iterator());
        while(probationFilter.hasNext())
        {
            System.out.println(probationFilter.next());
        }
    }
    
}
