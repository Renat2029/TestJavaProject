package GenericHomeTask1;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericStackTest {

    private GenericStack<Integer> stack;
    private static final int CAPACITY = 16;


    @Before
    public void setUp() throws Exception {
        stack = new GenericStack<>(CAPACITY);
    }



    @Test
    public void push() {

        GenericStack genericStack = new GenericStack(4);
        try {
            genericStack.push("Renat");
        } catch (StackExeption stackExeption) {
            stackExeption.printStackTrace();
        }
        Assert.assertEquals("Renat", genericStack.elements[0]);

    }

//    @Test
//    public void pop() {
//        GenericStack genericStack = new GenericStack(4);
//        try {
//            genericStack.push("Renat");
//            genericStack.push("Renat1");
//            genericStack.pop();
//        } catch (StackExeption stackExeption) {
//            stackExeption.printStackTrace();
//        }
//        Assert.assertEquals("Renat", genericStack.elements[0]);
//        Assert.assertEquals(null, genericStack.elements[1]);
//    }
    @Test
    public void pop() throws Exception {
        for (int i = 0; i < CAPACITY; i++) {
            stack.push(i);
        }
        for (int i = 0; i < CAPACITY; i++) {
            Integer actual = stack.pop();
            System.out.println("actual = " + actual);
            Integer expected = CAPACITY - 1 - i;
            System.out.println("expected = " + expected);
            assertEquals(expected, actual);
        }
        assertTrue(stack.isEmpty());
    }


    @Test
    public void getSize() {
        GenericStack genericStack = new GenericStack(4);
        try {

            genericStack.push("Renat");
            genericStack.push("Renat1");
        } catch (StackExeption stackExeption) {
            stackExeption.printStackTrace();
        }

        Assert.assertEquals(2,genericStack.getSize());
    }
}