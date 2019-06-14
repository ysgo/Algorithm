package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BSTNode {
	BSTNode left;
	BSTNode right;
	int val;

	BSTNode(int val) {
		left = right = null;
		this.val = val;
	}
}

class BinarySerachTree {
	private BSTNode root;

	public BinarySerachTree() {
		root = null;
	}

	public void add(int val) {
		//(1)번 구현
		if(root == null)
			root = new BSTNode(val);
		
	}

	public Boolean search(int val) {
		//(2)번 구현
		while(true) {
			if(root == null)
				return false;
			else {
				if(val == root.val) {
					return true;
				} else if(val < root.val) {
					root = root.left;
				} else {
					root = root.right;
				}
			}
		}
	}

	public Boolean remove(int val) {

		//(4)번 구현
		return true;
	}

	private int getkMinVal() {
		//(3)번 구현
		
		return 0;
	}

	private int getkMaxVal() {
		//(3)번 구현
		
		return 0;
	}

	public void printTree() {
		System.out.print("[Print tree]");
		System.out.printf("\nMin value: %d", getkMinVal());
		System.out.printf("\nMax value: %d", getkMaxVal());
		System.out.print("\nIn-order : ");
		printInOrder(this.root);
		System.out.print("\nPre-order : ");
		printPreOrder(this.root);
		System.out.print("\nPost-order : ");
		printPostOrder(this.root);
		System.out.print("\nLevel-order : ");
		printLevelOrder(this.root);
	}

	private void printInOrder(BSTNode current) {
		//(5)번 구현
	}

	private void printPreOrder(BSTNode current) {
		//(5)번 구현
	}

	private void printPostOrder(BSTNode current) {
		//(5)번 구현
	}

	private void printLevelOrder(BSTNode current) {
		//(5)번 구현
	}
}

public class BSTMain {
	public static void main(String[] args) {
		int arr[] = { 8, 4, 2, 1, 3, 6, 5, 7, 12, 10, 9, 11, 14, 13, 15 };
		BinarySerachTree bst = new BinarySerachTree();
		for (int i = 0; i < arr.length; i++) {
			bst.add(arr[i]);
		}

		bst.printTree();
		System.out.println();
		System.out.print("\n--------------------");
		System.out.print("\nremove data : " + 4);
		bst.remove(4);
		System.out.print("\nremove data : " + 15);
		bst.remove(15);
		System.out.print("\nremove data : " + 2);
		bst.remove(2);
		System.out.println("\n-------------------\n");
		bst.printTree();
	}
}
