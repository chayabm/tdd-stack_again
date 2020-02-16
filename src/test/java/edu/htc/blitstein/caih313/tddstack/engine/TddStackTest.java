package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.IStackable;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import edu.htc.blitstein.caih313.tddstack.resource.campus.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static edu.htc.blitstein.caih313.tddstack.engine.TddStack.DEFAULT_DEPTH;
import static org.junit.Assert.*;

public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStackDepthInitialisation() {
        TddStack tddStack = new TddStack();
        assertEquals(tddStack.stackDepth, TddStack.DEFAULT_DEPTH);
    }

    @Test
    public void testNewStackIsNotFull(){
        TddStack tddStack = new TddStack();
        assertFalse(tddStack.isFull());
    }

    @Test
    public void testNewStackIsEmpty() {
        TddStack tddStack = new TddStack();
        assertTrue(tddStack.isEmpty());
    }

    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }

    @Test
    public void testStackIsNotEmpty(){
        TddStack tddStack = new TddStack();
        IStackable iStackableAddedObject = new Student();
        tddStack.push(iStackableAddedObject);
        assertFalse(tddStack.isEmpty());
    }

    @Test
    public void testIsFullTrue(){
        TddStack tddStack = new TddStack(3);
        IStackable one = new Student();
        IStackable two = new Student();
        IStackable three = new Student();
        tddStack.push(one);
        tddStack.push(two);
        tddStack.push(three);
        assertTrue(tddStack.isFull());
    }
}
