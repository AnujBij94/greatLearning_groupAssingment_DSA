package bstFunctionalities;

import bstBaseBuildingUnit.Node;

public class FunctionToAcessBstTranscations {
	
	
	// create a function to generate a new node ie the root node
	public Node createNewNode(int Val) {
		Node a = new Node();
		a.setData(Val);
		a.setLeft(null);
		a.setRight(null);
		return a;
	}
	
	
	
	// create a function to insert nodes into the Binary Search tree
	public Node insertNode(Node node, int val) {
		// create a new node if no existing value is present in the tree ie the root node is empty
		if(node == null) {
			return createNewNode(val);
		}
		
		// if current value to be entered is less than the root then insert to the left of the root
		if(val< node.getData()) {	
			node.setLeft(insertNode(node.getLeft(),val));
		}
		// if current value to be enetered is greater than the root then insert to the right of the root
		else if(val> node.getData()) {
			node.setRight(insertNode(node.getRight(),val));
		}
		return node;
	}
	
	
	
	// traverse the bst in inorder notation in order to create a right skewed or Assending order BST
	public  void inOrder(Node node) {
	    if (node == null)
	      return;
	    // traverse the left child
	    inOrder(node.getLeft());
	    // traverse the root node
	    System.out.print(node.getData() + " ");
	    // traverse the right child
	    inOrder(node.getRight());
	  }
	
	

}
