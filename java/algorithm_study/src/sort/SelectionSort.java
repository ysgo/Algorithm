package sort;

import java.util.Scanner;

// 단순 선택 정렬 = 가장 작은 요소부터 선택해 알맞은 위치로 옮겨 순서대로 정렬하는 알고리즘
// 과정
// 1.아직 정렬하지 않은 부분에서 가장 작은 키의 값(a[min])을 선택
// 2.a[min]과 아직 정렬하지 않은 부분의 첫 번째 요소를 교환
public class SelectionSort {
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;	// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록
			for(int j=i+1; j<n; j++) {
				if(a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
	}
	
	// a[idx1]와 a[idx2]의 값을 바꾼다
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 선택 정렬");
		System.out.print("요솟 수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		selectionSort(x, nx); // 배열 x를 버블 정렬합니다

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
		stdIn.close();
	}
}
