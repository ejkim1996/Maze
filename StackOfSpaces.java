package proj3;

/**
 * This class is a reference-based stack class for SquarePosition objects.
 * @author EJ (Eui Joon) Kim
 *
 */

public class StackOfSpaces implements SetOfSpaces {
	//declare private top variable
	private SquareNode top;
	
	/**
	 * Default constructor. Sets top variable to null.
	 */
	public StackOfSpaces() {
		top = null;
	}
	
	/**
	 * Add a SquarePosition object to the stack.
	 * @param s object to be added
	 */
	@Override
	public void add(SquarePosition s) {
		SquareNode newNode = new SquareNode(s);
		newNode.setNext(top);
		top = newNode;
	}

	/**
	 * Remove the top SquarePosition object from the stack.
	 * @return the top object, or null if stack is empty
	 */
	@Override
	public SquarePosition remove() {
		if (!isEmpty()) {
			SquarePosition removed = top.getInfo();
			top = top.getNext();
			return removed;
		}
		else {
			return null;
		}
		
	}

	/**
	 * Determines if stack is empty or not.
	 * @return true if stack is empty. false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return top == null;
	}
}
