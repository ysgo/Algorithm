package sort;

import java.util.Scanner;

/* 힙 정렬 = 힙의 특성(가장 큰 값이 루트에 위치)을 이용한 정렬 알고리즘
 * 힙 = 부모의 값이 자식의 값보다 항상 크다는 조건을 만족하는 완전이진트리
 * (부모의 값이 자식보다 항상 작아도 힙이라고 한다 = 부모와 자식 요소의 관계가 일정만 하면 됨)
 * 부모의 값 >= 자식의 값 -> 힙의 가장 위쪽 값 = 루트
 * <관계>
 * 1.부모와 자식 관계는 일정   2.형제 사이의 대소 관계는 일정하지 않음(부분순서트리)
 * <배열로 힙 만들기>
 * bottom-up = 아랫부분의 작은 부분트리부터 시작해 올라가는 방식(<-> top-down)
 * 시간 복잡도 = O(nlogn)
 */

public class HeapSort {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// a[left] ~ a[right] 를 힙으로 만듬
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left];	// 루트
		int child;			// 큰 값을 가진 노드
		int parent;			// 부모
		
		for(parent = left; parent < (right+1) / 2; parent=child) {
			int cl = parent * 2 + 1;	// 왼쪽 자식
			int cr = cl + 1;			// 오른쪽 자식
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl; 	// 큰 값을 가진 노드를 자식에 대입
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	// 힙 정렬
	static void heapSort(int[] a, int n) {
		for(int i=(n-1)/2; i>=0; i--)	// a[i] ~ a[n-1]를 힙으로 만들기
			downHeap(a, i, n-1);
		
		for(int i=n-1; i>0; i--) {
			swap(a, 0, i);				// 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
			downHeap(a, 0, i-1);		// a[0] ~ a[i-1]을 힙으로 만듬
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("힙 정렬");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		heapSort(x, nx);
		
		System.out.println("오름차순으로 정렬헀습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
		stdIn.close();
	}
}
