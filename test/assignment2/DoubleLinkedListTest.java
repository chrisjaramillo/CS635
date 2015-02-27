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
     * Test of offerFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testOfferFirst() {
        System.out.println("offerFirst");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.offerFirst(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offerLast method, of class DoubleLinkedList.
     */
    @Test
    public void testOfferLast() {
        System.out.println("offerLast");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.offerLast(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLast method, of class DoubleLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollFirst method, of class DoubleLinkedList.
     */
    @Test
    public void testPollFirst() {
        System.out.println("pollFirst");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.pollFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollLast method, of class DoubleLinkedList.
     */
    @Test
    public void testPollLast() {
        System.out.println("pollLast");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.pollLast();
        assertEquals(expResult, result);
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
     * Test of removeFirstOccurrence method, of class DoubleLinkedList.
     */
    @Test
    public void testRemoveFirstOccurrence() {
        System.out.println("removeFirstOccurrence");
        Object o = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.removeFirstOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastOccurrence method, of class DoubleLinkedList.
     */
    @Test
    public void testRemoveLastOccurrence() {
        System.out.println("removeLastOccurrence");
        Object o = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.removeLastOccurrence(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class DoubleLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.add(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of offer method, of class DoubleLinkedList.
     */
    @Test
    public void testOffer() {
        System.out.println("offer");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.offer(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DoubleLinkedList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poll method, of class DoubleLinkedList.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.poll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of element method, of class DoubleLinkedList.
     */
    @Test
    public void testElement() {
        System.out.println("element");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.element();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of push method, of class DoubleLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.push(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class DoubleLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        DoubleLinkedList instance = new DoubleLinkedList();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class DoubleLinkedList.
     */
    @Test
    public void testRemove_Object() {
        System.out.println("remove");
        Object o = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.remove(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class DoubleLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object o = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(o);
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
        DoubleLinkedList instance = new DoubleLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    /**
     * Test of containsAll method, of class DoubleLinkedList.
     */
    @Test
    public void testContainsAll() {
        System.out.println("containsAll");
        Collection clctn = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.containsAll(clctn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAll method, of class DoubleLinkedList.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        Collection clctn = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.addAll(clctn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class DoubleLinkedList.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Collection clctn = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.removeAll(clctn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainAll method, of class DoubleLinkedList.
     */
    @Test
    public void testRetainAll() {
        System.out.println("retainAll");
        Collection clctn = null;
        DoubleLinkedList instance = new DoubleLinkedList();
        boolean expResult = false;
        boolean result = instance.retainAll(clctn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DoubleLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DoubleLinkedList instance = new DoubleLinkedList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
