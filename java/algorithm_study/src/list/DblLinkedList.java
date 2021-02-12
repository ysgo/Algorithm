package list;

import java.util.Comparator;

/* 원형 이중 연결 리스크 클래스 구현하는 클래스
 * 원형 리스트 = 연결 리스트의 꼬리 노드가 머리 노드를 가리키는 고리 모양으로 나열된 데이터를 저장할 때 알맞은 자료구조
 * 이중 연결 리스트 = 연결 리스트의 단점인 다음 노드는 찾기 쉽지만 앞쪽의 노드는 찾을 수 없는 점을 개선한 자료구조
 * 원형 이중 연결 리스트 = 위의 두가지 개념이 합해진 자료구조
 */
public class DblLinkedList<E> {
	// 노드
	@SuppressWarnings("hiding")
	class Node<E> {
		private E data;
		private Node<E> prev;		// 앞쪽 포인터(앞쪽 노드)
		private Node<E> next;		// 뒤쪽 포인터
		
		// 생성자
		Node() {
			data = null;
			prev = next = this;
		}
		
		// 생성자
		Node(E obj, Node<E> prev, Node<E> next) {
			data = obj;
			this.prev = prev;
			this.next = next;
		}
		
	}
	private Node<E> head;		// 더미 노드(머리 노드는 더미노드의 뒤쪽 포인터가 가리키는 노드)
	private Node<E> crnt;		// 선택 노드
	
	// 생성자
	public DblLinkedList() {
		head = crnt = new Node<E>();	// 더미 노드를 생성
	}
	
	// 리스트가 비어 있는가?
	public boolean isEmpty() {
		return head.next == head;
	}
	
	// 노드를 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head.next;	// 현재 스캔 중인 노드
		
		while(ptr != head) {
			if(c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;	// 검색 성공
			}
			ptr = ptr.next;			// 다음 노드로 선택
		}
		return null;		// 검색 실패
	}
	
	// 선택 노드를 출력
	public void printCurrentNode() {
		if(isEmpty())
			System.out.println("선택 노드가 없습니다.");
		else
			System.out.println(crnt.data);
	}
	
	// 모든 노드를 출력
	public void dump() {
		Node<E> ptr = head.next;		// 더미의 다음 노드
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	// 모든 노드를 거꾸로 출력
	public void dumpReverse() {
		Node<E> ptr = head.prev;		// 더미의 앞쪽 노드
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	// 선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(isEmpty() || crnt.next == head) {
			return false;	// 이동할 수 없음
		}
		crnt = crnt.next;
		return true;
	}
	
	// 선택 노드를 하나 앞쪽으로 이동
	public boolean prev() {
		if(isEmpty() || crnt.prev == head) {
			return false;	// 이동할 수 없음
		}
		crnt = crnt.prev;
		return true;
	}
	
	// 선택 노드의 바로 뒤에 노드를 삽입
	public void add(E obj) {
		// 생성한 노드의 앞쪽 포인터와 뒤쪽 포인터는 더미 노드를 가리킴
		Node<E> node = new Node<E>(obj, crnt, crnt.next);
		// 더미 노드의 뒤쪽 포인터와 앞쪽 포인터가 가리키는 곳은 삽입하는 노드
		crnt.next = crnt.next.prev = node;
		// 선택 노드가 가리키는 곳은 바로 삽입한 노드
		crnt = node;
	}
	
	// 머리에 노드를 삽입
	public void addFirst(E obj) {
		crnt = head;		// 더미 노드 head의 바로 뒤에 삽입
		add(obj);
	}
	
	// 꼬리에 노드를 삽입
	public void addLast(E obj) {
		crnt = head.prev;	// 꼬리 노드 head.prev의 바로 뒤에 삽입
		add(obj);
	}
	
	// 선택 노드를 삭제
	public void removeCurrentNode() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if(crnt == head) crnt = head.next;
		}
	}
	
	// 노드 p를 삭제
	public void remove(Node<E> p) {
		Node<E> ptr = head.next;
		
		while(ptr != head) {
			if(ptr == p) {	// p를 찾음
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}
	
	// 머리 노드를 삭제
	public void removeFirst() {
		crnt = head.next;	// 머리 노드 head.next를 삭제
		removeCurrentNode();
	}
	
	// 꼬리 노드를 삭제
	public void removeLast() {
		crnt = head.prev;	// 꼬리 노드 head.prev를 삭제
		removeCurrentNode();
	}
	
	// 모든 노드를 삭제
	public void clear() {
		while(!isEmpty())	// 텅 빌 때까지
			removeFirst();	// 머리 노드를 삭제
	}
}
