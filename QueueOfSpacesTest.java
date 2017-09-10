package proj3;

/**
 * This class is a jUnit test class for the QueueOfSpaces class.
 * @author EJ (Eui Joon) Kim
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class QueueOfSpacesTest {

	/**
	 * Test QueueOfSpaces constructor.
	 */
	@Test
	public void testQueueOfSpaces() {
		try {
			//instantiate QueueOfSpaces variable.
			QueueOfSpaces queue = new QueueOfSpaces();
			
			//test whether reference is null or not.
			assertNotNull("Default constructor returned null reference.", queue);
		} catch(Exception e) {
			fail("testStackOfSpaces failed: Exception thrown \n"
					+ e.getClass() + "\n" + e.getMessage());
		}
	}

	/**
	 * Test add() method for QueueOfSpaces.
	 */
	@Test
	public void testAdd() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		SquarePosition square2 = new SquarePosition(3,4);
		SquarePosition square3 = new SquarePosition(5,6);
		QueueOfSpaces queue = new QueueOfSpaces();
		
		//add SquarePosition objects, remove and store values for test
		queue.add(square1);
		queue.add(square2);
		SquarePosition remove1 = queue.remove();
		queue.add(square3);
		SquarePosition remove2 = queue.remove();
		
		//test with assert statements
		assertFalse("QueueOfSpaces should not be empty.", queue.isEmpty());
		assertEquals("remove1 should be equal to square1", remove1, square1);
		assertEquals("remove2 object should be equal to square2", remove2, square2);
	}

	/**
	 * Test remove() method for QueueOfSpaces.
	 */
	@Test
	public void testRemove() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		SquarePosition square2 = new SquarePosition(3,4);
		QueueOfSpaces queue = new QueueOfSpaces();
		
		//add SquarePosition objects, remove and store values for test
		queue.add(square1);
		queue.add(square2);
		SquarePosition remove1 = queue.remove();
		SquarePosition remove2 = queue.remove();
		SquarePosition remove3 = queue.remove();
		
		//test with assert statements
		assertEquals("remove1 should be equal to square1", remove1, square1);
		assertEquals("remove2 should be equal to square2", remove2, square2);
		assertEquals("remove3 should be equal to null", remove3, null);
		assertTrue("Queue should remain empty after remove is called on empty queue.", queue.isEmpty());
	}

	/**
	 * Test isEmpty() method for QueueOfSpaces.
	 */
	@Test
	public void testIsEmpty() {
		//instantiate variables to use
		SquarePosition square1 = new SquarePosition(1,2);
		QueueOfSpaces queue = new QueueOfSpaces();
		
		//check if stack is empty at creation
		assertTrue("Queue should be empty at creation.", queue.isEmpty());
		
		//check if stack is not empty after adding object
		queue.add(square1);
		assertFalse("Queue should NOT be empty after add.", queue.isEmpty());
		
		//check if stack is empty after removing only object in it
		queue.remove();
		assertTrue("Queue should be empty after only element is removed.", queue.isEmpty());
	}

}
