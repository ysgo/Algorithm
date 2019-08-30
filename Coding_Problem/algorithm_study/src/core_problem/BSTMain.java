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
		BSTNode current = root;
		if(root == null) {
			root = new BSTNode(val);
//			System.out.print(root.val + " ");
		}
		else {
			while(true) {
				if(current == null)
					return;
				else {
					if(val < current.val) {
						if(current.left == null) {
							current.left = new BSTNode(val);
	//						System.out.print(current.val + " ");
							break;
						} else
							current = current.left;
					} else if(val > current.val) {
						if(current.right == null) {
							current.right = new BSTNode(val);
	//						System.out.print(current.val + " ");
							break;
						} else
							current = current.right;
					} else
						return;
				}
			}
		}
	}

	public Boolean search(int val) {
		//(2)번 구현
		BSTNode current = root;
		while(true) {
			if(current == null)
				return false;
			else {
				if(val > current.val) {
					current = current.right;
				} else if(val < current.val) {
					current = current.left;
				} else {
					return true;
				}
			}
		}
	}

	public Boolean remove(int val) {
		//(4)번 구현
		BSTNode current = root;
		BSTNode pre = null;
		if(root == null)
			return false;
		else {	// 제거하려는 노드를 찾는 과정 
				if(root.val != val) {	// 루트가 삭제할 노드가 아닐때 
					pre = root;			// 이전 노드를 루트로 설정
					if(val < pre.val)		// 값이 루트노드보다 값이 작을 경우 왼쪽 방향으로 
						current = pre.left;	// 왼쪽 노드를 현재 노드로 설정 
					else if(val > pre.val)
						current = pre.right;
					while(true) {
						if(current.val == val)	// 이동한 현재노드가 제거하려는 노드일때 반복 종료 
							break;
						else {
							pre = current;		// 현재 노드를 이전 노드로 설정 
							if(val < current.val)	// 현재 노드의 값과 제거하려는 값을 비교하여 현재 노드 이동 
								current = current.left;
							else
								current = current.right;
						}
					}
				}
				else
					current = root;
				// 값을 찾았는지에 따른 값 제거
				if(current == null)
					return false;
				else {
					if(current.left==null && current.right==null) {
						if(pre == null)	// 현재 노드가 root
							root = null;
						else {	// 이전 노드가 root가 아닌 노드 
							if(current == pre.left)	// 현재 노드가 이전 노드의 왼쪽일때 
								pre.left = null;
							else
								pre.right = null;
						}
					} else if(current.left==null || current.right==null) {	// 노드가 하나만 있을때 
						if(current == pre.left) {			// 현재 노드가 이전 노드의 왼쪽일때 
							if(current.left == null)
								pre.left = current.right;
							else
								pre.left = current.left;
						} else {							// 현재 노드가 이전 노드의 우측일때 
							if(current.left == null)
								pre.right = current.right;
							else
								pre.right = current.left;
						}
					} else if(current.left != null && current.right != null) {	// 자식노드가 둘다 있을때 
						BSTNode chg = current.right;
						BSTNode preChg = current;
						while(true) {
							if(chg.left == null)
								break;
							else {
								preChg = chg;
								chg = chg.left;
							}
						}
						if(preChg.left == chg)
							preChg.left = chg.right;
						else
							preChg.right = chg.right;
						current.val = chg.val;
					}
					return true;
				}	
		}
	}

	private int getkMinVal() {
		//(3)번 구현
		BSTNode current = root;
		while(true) {
			if(current.left == null)
				break;
			else
				current = current.left;
		}
		return current.val;
	}

	private int getkMaxVal() {
		//(3)번 구현
		BSTNode current = root;
		while(true) {
			if(current.right == null)
				break;
			else
				current = current.right;
		}
		return current.val;
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
		if(current != null) {
			System.out.print(current.val + " ");
			printInOrder(current.left);
			printInOrder(current.right);
		}
	}

	private void printPreOrder(BSTNode current) {
		//(5)번 구현
		if(current != null) {
			printPreOrder(current.left);
			System.out.print(current.val + " ");
			printPreOrder(current.right);
		}
	}

	private void printPostOrder(BSTNode current) {
		//(5)번 구현
		if(current != null) {
			printPostOrder(current.right);
			System.out.print(current.val + " ");
			printPostOrder(current.left);
		}
	}

	private void printLevelOrder(BSTNode current) {
		//(5)번 구현
		List<Integer> list = new ArrayList<>();
		Queue<BSTNode> q = new LinkedList<>();
		BSTNode delete=null;
		q.add(current);
		while(!q.isEmpty()) {
			delete = q.poll();
			list.add(delete.val);
			if(delete.left != null) {
				q.add(delete.left);
			}
			if(delete.right != null) {
				q.add(delete.right);
			}
		}
		System.out.println(list);		// 레벨 구간마다 큰괄호 주는 것이 필수는 아니지만 구현이 안됨...
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
//		bst.remove(2);
//		bst.remove(3);
//		bst.remove(5);
//		bst.remove(6);
//		bst.remove(7);
//		bst.remove(8);	// 삭제하는 노드가 root일
//		bst.remove(10);
//		bst.remove(11);
//		bst.remove(12);
		System.out.println("\n-------------------\n");
		bst.printTree();
	}
}
