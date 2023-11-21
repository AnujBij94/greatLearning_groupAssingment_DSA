package bstBaseBuildingUnit;


public class Node {
	
	private int data;				// value to be stored
	private Node left;				
	private Node right;
	
	// getter setter functions to acess the instace variables of class Node
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

}
