package codingtest;

public class ESTProblem2 {
	public static int solution(Tree T) {
		
		return 0;
    }
	public static void main(String[] args) {
//		Format: (1, (2, (3, (2, None, None), None), (6, None, None)), (3, (3, None, None), (1, (5, None, None), (6, None, None))))
		int[] arr = {1, 2, 3, 2, 6, 3, 3, 1, 5, 6};
		BTree T = new BTree();
		for(int i=0; i<arr.length; i++) {
			
		}
	}
	static class Tree {
		public int x;
		public Tree l;
		public Tree r;
		
		Tree(int val) {
			l = r = null;
			x = val;
		}
	}
	static class BTree {
		private Tree root;
		BTree() {
			root = null;
		}
		
		
	}
}
