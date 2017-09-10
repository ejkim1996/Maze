package proj3;

/**
 * This class is a SquareNode class to hold SquarePosition objects and link references.
 * @author EJ (Eui Joon) Kim
 *
 */

public class SquareNode {
	//declare private next and info variables
	private SquareNode next;
	private SquarePosition info;

	/**
	 * Create a SquareNode object with SquarePosition info.
	 * @param info SquarePosition object to hold in info variable.
	 */
	public SquareNode(SquarePosition info) {
		this.info = info;
		next = null;
	}
	
	/**
	 * Get the SquarePosition object info held by the SquareNode
	 * @return SquarePosition object.
	 */
	public SquarePosition getInfo() {
		return info;
	}
	
	/**
	 * Links current SquareNode with another SquareNode.
	 * @param next the SquareNode object to link to.
	 */
	public void setNext(SquareNode next) {
		this.next = next;
	}
	
	/**
	 * Get the next SquareNode the object is linked to.
	 * @return the SquareNode that current SquareNode is linked to.
	 */
	public SquareNode getNext() {
		return next;
	}
}
