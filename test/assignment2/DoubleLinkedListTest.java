/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Collection;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher
 */
public class DoubleLinkedListTest {
    
    public DoubleLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNull() {
        System.out.println("add");
        Student e = null;
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<Student>(strategy);
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNullToExisting() {
        System.out.println("add");
        Student e = null;
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList(strategy);
        instance.add(new Student());
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddOneStudent() {
        System.out.println("addOneStudent");
        Student e = new Student();
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>(strategy);
        boolean expResult = true;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 1);
    }
    
    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddTwoStudents() {
        System.out.println("addTwoStudents");
        Student e = new Student();
        Student e1 = new Student();
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>(strategy);
        boolean expResult = true;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 1);
        result = instance.add(e1);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 2);
    }
    
    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddThreeStudents() {
        System.out.println("addThreeStudents");
        Student e = new Student();
        Student e1 = new Student();
        Student e2 = new Student();
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>(strategy);
        boolean expResult = true;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 1);
        result = instance.add(e1);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 2);
        result = instance.add(e2);
        assertEquals(expResult, result);
        assertEquals(instance.size(), 3);
    }
    
    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddFourStudents() {
        System.out.println("addFourStudents");
        Student e = new Student();
        Student e1 = new Student();
        Student e2 = new Student();
        Student e3 = new Student();
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>(strategy);
        boolean expResult = true;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        result = instance.add(e1);
        assertEquals(expResult, result);
        result = instance.add(e2);
        assertEquals(expResult, result);
        result = instance.add(e3);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class DoubleLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Student e = new Student();
        Student e1 = new Student();
        Student e2 = new Student();
        Student e3 = new Student();
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>(strategy);
        boolean result = instance.add(e);
        assertEquals(instance.size(), 1);
        result = instance.add(e1);
        assertEquals(instance.size(), 2);
        result = instance.add(e2);
        assertEquals(instance.size(), 3);
        result = instance.add(e3);
        assertEquals(instance.size(), 4);
    }

    /**
     * Test of iterator method, of class DoubleLinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList instance = new DoubleLinkedList(strategy);
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertNotNull(result);
    }

    /**
     * Test of isEmpty method, of class DoubleLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList instance = new DoubleLinkedList(strategy);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of toArray method, of class DoubleLinkedList.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        DoubleLinkedListOrderStrategy strategy = new DoubleLinkedListIncreasingOrderStrategy();
        DoubleLinkedList instance = new DoubleLinkedList(strategy);
        Object[] result = instance.toArray();
        assertNotNull(result);
    }
}