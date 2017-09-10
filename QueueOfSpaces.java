package proj3;

/**
 * This class is a reference-based queue class for SquarePosition objects.
 * @author EJ (Eui Joon) Kim
 *
 */

public class QueueOfSpaces implements SetOfSpaces {
	//declare private front and end variables.
	private SquareNode front;
	private SquareNode end;
	
	/**
	 * Default constructor. Sets front and end variables to null.
	 */
	public QueueOfSpaces() {
		front = null;
		end = null;
	}
	
	/**
	 * Add a SquarePosition object to the queue.
	 * @param s object to be added
	 */
	@Override
	public void add(SquarePosition s) {
		SquareNode newNode = new SquareNode(s);
		if (!isEmpty()) {
			end.setNext(newNode);
		}
		else {
			front = newNode;
		}
		end = newNode;

	}

	/**
	 * Remove the front SquarePosition object from the queue.
	 * @return the front object, or null if queue is empty
	 */
	@Override
	public SquarePosition remove() {
		if (!isEmpty()) {
			SquarePosition removed = front.getInfo();
			front = front.getNext();
			if (front == null) {
				end = null;
			}
			return removed;
		}
		else {
			return null;
		}
	}

	/**
	 * Determines if queue is empty or not.
	 * @return true if queue is empty. false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return front == null;
	}

}
