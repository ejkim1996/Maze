package proj3;

/**
 * This class is a jUnit test class for the StackOfSpaces class.
 * @author EJ (Eui Joon) Kim
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class StackOfSpacesTest {

	/**
	 * Test StackOfSpaces constructor.
	 */
	@Test
	public void testStackOfSpaces() {
		try {
			//instantiate StackOfSpaces variable.
			StackOfSpaces stack = new StackOfSpaces();
			
			//test whether reference is null or not.
			assertNotNull("Default constructor shouldn't return null reference.", stack);
		} catch(Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n"
					+ e.getClass() + "\n" + e.getMessage());
		}
	}

	/**
	 * Test add() method for StackOfSpaces.
	 */
	@Test
	public void testAdd() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		SquarePosition square2 = new SquarePosition(3,4);
		SquarePosition square3 = new SquarePosition(5,6);
		StackOfSpaces stack = new StackOfSpaces();
		
		//add SquarePosition objects, remove and store values for test
		stack.add(square1);
		stack.add(square2);
		SquarePosition remove1 = stack.remove();
		stack.add(square3);
		SquarePosition remove2 = stack.remove();
		
		//test with assert statements
		assertFalse("StackOfSpaces should not be empty.", stack.isEmpty());
		assertEquals("remove1 should be equal to square2", remove1, square2);
		assertEquals("remove2 should be equal to square3", remove2, square3);	
	}

	/**
	 * Test remove() method for StackOfSpaces.
	 */
	@Test
	public void testRemove() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		SquarePosition square2 = new SquarePosition(3,4);
		StackOfSpaces stack = new StackOfSpaces();
		
		//add SquarePosition objects, remove and store values for test
		stack.add(square1);
		stack.add(square2);
		SquarePosition remove1 = stack.remove();
		SquarePosition remove2 = stack.remove();
		SquarePosition remove3 = stack.remove();
		
		//test with assert statements
		assertEquals("remove1 should be equal to square2", remove1, square2);
		assertEquals("remove2 should be equal to square1", remove2, square1);
		assertNull("remove3 should be equal to null", remove3);
		assertTrue("Stack should remain empty after remove is called on empty queue.", stack.isEmpty());

	}

	/**
	 * Test isEmpty() method for StackOfSpaces.
	 */
	@Test
	public void testIsEmpty() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		StackOfSpaces stack = new StackOfSpaces();
		
		//check if stack is empty at creation
		assertTrue("Stack should be empty at creation.", stack.isEmpty());
		
		//check if stack is not empty after adding object
		stack.add(square1);
		assertFalse("Stack should NOT be empty after add.", stack.isEmpty());
		
		//check if stack is empty after removing only object in it
		stack.remove();
		assertTrue("Stack should be empty after only element is removed.", stack.isEmpty());
	}

}
