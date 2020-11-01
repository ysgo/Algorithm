package tree;

import java.util.Comparator;

// Do it! 자료구조와 알고리즘 이진검색트리 중위순회

public class BinTree<K, V> {	
	// 1.이진트리의 개별 노드를 클래스로 구성(Key와 Value)로 구성:Node<K, V>
	static class Node<K, V> {
		private K key;				// 키 값
		private V data;			// 데이터 값
		private Node<K, V> left;	// 왼쪽 자식 노드
		private Node<K, V> right;	// 오른쪽 자식 노드
		
	// 2.생성자: 전달받은 값을 그대로 설정
	Node(K key, V data, Node<K, V> left, Node<K, V> right) {
		this.key = key;
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	// 3. 키,데이터 값을 반환, print
	K getKey() {
		return key;
	}
	V getValue() {
		return data;
	}
	void print() {
		System.out.println(data);
	}
}
	// 4.이진검색트리 클래스의 필드 구성(위치는 클래스 밑에 위치해도 될듯)
	private Node<K, V> root;						// 루트를 참조하는 노드
	private Comparator<? super K> comparator = null;// 키 값의 대소 관계 비교자
	
	// 5.생성자 생성(자연 순서와, 비교자에 따른 키 값 비교를 위한 생성자)
	public BinTree() {
		root = null;		// 노드가 하나도 없는 상태의 이진트리 생성
	}
	public BinTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}
	
	// 6.두 키 값을 비교하는 메소드(검색, 삽입, 삭제 기능 수행을 위해 존재하는 비공개 메소드)
	@SuppressWarnings("unchecked")
	private int comp(K key1, K key2) {	// Comparator과 Comparable 차이 알기
		return (comparator==null)?((Comparable<K>)key1).compareTo(key2)
								:comparator.compare(key1, key2);
	}
	
	// 7.키 값으로 검색하는 메소드
	public V search(K key) {
		Node<K, V> p = root;	// 주목하는 노드가 루트
		
		while(true) {
			if(p == null)		// 더 이상 노드가 진행하지 않으면(노드가 마지막)
				return null;	// 검색 실패
			int cond = comp(key, p.getKey());	// key와 노드p의 key 비교
			if(cond == 0)		// 비교했을 때 같다면
				return p.getValue();	// 검색 성공한 값을 반환
			else if(cond < 0)	// key 쪽이 작다면
				p = p.left;		// 왼쪽 서브 트리에서 검색
			else				// key 쪽이 크다면
				p = p.right;	// 오른쪽 서브 트리에서 검색
		}
	}
	
	// 8.node를 루트로 하는 서브트리에 노드<K, V> 삽입: 서브트리 노드를 생성
	private void addNode(Node<K, V> node, K key, V data) {
		int cond = comp(key, node.getKey());
		if(cond == 0)	// key가 이미 존재
			return;		// 종료
		else if(cond < 0) {
			if(node.left == null)
				node.left = new Node<K, V>(key, data, null, null);				
			else
				addNode(node.left, key, data);	// 왼쪽 서브트리에 주목
		} else {
			if(node.right == null)
				node.right = new Node<K, V>(key, data, null, null);
			else
				addNode(node.right, key, data);	// 오른쪽 서브트리에 주목
		}
	}
	
	// 9.노드 삽입 메소드
	public void add(K key, V data) {
		if(root == null)	// 트리가 비어있는 상태: 루트만으로 이루어진 트리를 만들어야함
			root = new Node<K, V>(key, data, null, null);
		else
			addNode(root, key, data);	// 트리가 비어있지 않음: 노드를 삽입
	}
	
	// 10.노드 삭제 메소드
	public boolean remove(K key) {
		Node<K, V> p = root;		// 스캔중인 노드
		Node<K, V> parent = null;	// 스캔중인 노드의 부모 노드	
		boolean isLeftChild = true;	// 노드 p가 부모 노드의 왼쪽 자식 노드인지 여부
		
		while(true) {
			if(p == null)			// 찾는 노드가 더 이상 없다
				return false;		// 그 키 값은 없다
			int cond = comp(key, p.getKey());	// key와 p의 key 값을 비교
			if(cond == 0)			// 키 값이 같을 경우
				break;				// 검색 성공
			else {
				parent = p;			// 노드를 찾기 전에 부모 노드를 설정
				if(cond < 0) {		// 비교한 값이 key가 더 작을 경우
					isLeftChild = true;	// 왼쪽 자식 노드가 있기에 이쪽 가지로 내려감
					p = p.left;			// 왼쪽 서브트리에서 검색
				} else {				// p의 key값이 더 클 경우
					isLeftChild = false;// 오른쪽 방향으로 내려감
					p = p.right;		// 오른쪽 서브트리에서 검색
				}
			}
		}
		
		if(p.left == null) {			// p의 왼쪽 자식이 없다면
			if(p == root)				// p가 루트일때
				root = p.right;			// 루트가 p의 오른쪽 자식노드를 가리킴
			else if(isLeftChild)		// p가 부모의 왼쪽 자식일때
				parent.left = p.right;	// 부모의 왼쪽 노드가 p의 오른쪽 자식노드를 가리킴
			else
				parent.right = p.right;	// 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
		} else if(p.right == null) {	// p의 오른쪽 자식이 없을때
			if(p == root)
				root = p.left;
			else if(isLeftChild)
				parent.left = p.left;
			else
				parent.right = p.left;
		} else {
			parent = p;					// 노드 찾기 전 부모 노드를 설정
			Node<K, V> left = p.left;	// 서브 트리 중 왼쪽 가지의 가장 큰 노드
			isLeftChild = true;			
			while(left.right != null) {	// 가장 큰 노드 left를 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key = left.key;			// left 키 값을 p로 옮김
			p.data = left.data;			// left 데이터를 p로 옮김
			if(isLeftChild)
				parent.left = left.left;	// left를 삭제 
			else
				parent.right = left.left;	// left를 삭제
		}
		return true;
	}
	
	// 11.node를 루트로 하는 서브 트리의 노드를 키 값의 오름차순으로 출력
	private void printSubTree(@SuppressWarnings("rawtypes") Node node) {
		if(node != null) {
			printSubTree(node.left);	// 왼쪽 서브 트리를 키 값의 오름차순으로 출력
			System.out.println(node.key + " " + node.data);
			printSubTree(node.right);	// 오른쪽 서브트리를 키 값의 오름차순으로 출력
		}
	}
	// 12.모든 노드를 키 값의 오름차순으로 출력
	public void print() {
		printSubTree(root);
	}
	// 노드를 키 값의 내림차순으로 출력시 printSubTree의 순서를 오른쪽부터 재귀 실시
}
