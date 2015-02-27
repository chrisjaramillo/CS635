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
     * Test of addFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.addFirst(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class DoubleLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.addLast(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLast method, of class DoubleLinkedList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.getLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.peekFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of peekLast method, of class DoubleLinkedList.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.peekLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAddNull() {
        System.out.println("add");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList();
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>();
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>();
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>();
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>();
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
     * Test of peek method, of class DoubleLinkedList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        DoubleLinkedList<Student> instance = new DoubleLinkedList<>();
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
        DoubleLinkedList instance = new DoubleLinkedList();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of descendingIterator method, of class DoubleLinkedList.
     */
    @Test
    public void testDescendingIterator() {
        System.out.println("descendingIterator");
        DoubleLinkedList instance = new DoubleLinkedList();
        Iterator expResult = null;
        Iterator result = instance.descendingIterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class DoubleLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class DoubleLinkedList.
     */
    @Test
    public void testToArray_0args() {
        System.out.println("toArray");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object[] expResult = null;
        Object[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class DoubleLinkedList.
     */
    @Test
    public void testToArray_GenericType() {
        System.out.println("toArray");
        Object[] ts = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        Object[] expResult = null;
        Object[] result = instance.toArray(ts);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}