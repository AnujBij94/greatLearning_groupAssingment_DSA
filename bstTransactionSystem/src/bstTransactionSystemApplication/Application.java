package bstTransactionSystemApplication;

import bstBaseBuildingUnit.Node;
import bstFunctionalities.FunctionToAcessBstTranscations;

public class Application {
	
	public static void main(String[] args) {
		
		// create a object of class BST type to acess all the functionalities of BST
		FunctionToAcessBstTranscations ob1 = new FunctionToAcessBstTranscations();
		
		// declare the root node of the BST as null
		Node root = null;
		
		// generate a bst by passing any random values to it
		root = ob1.insertNode(root,8);
		root = ob1.insertNode(root, 10);
		root = ob1.insertNode(root,2);
		root = ob1.insertNode(root, 6);
		root = ob1.insertNode(root,7);
		root = ob1.insertNode(root, 11);
		root = ob1.insertNode(root,1);
		root = ob1.insertNode(root, 9);
		root = ob1.insertNode(root, -9);
		root = ob1.insertNode(root, 89);
		root = ob1.insertNode(root, 0);
		
		// traverse the above created bst to generate a right skewed sequence on console
		ob1.inOrder(root);
	
	}

}
