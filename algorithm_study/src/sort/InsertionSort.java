package sort;

import java.util.Scanner;

// 단순 삽입 정렬 = 선택할 요소를 그보다 더 앞쪽의 알맞은 위치에 '삽입하는' 작업을 반복하여 정렬하는 알고리즘
// 과정
// 1.정렬된 열의 왼쪽 끝에 도달
// 2.tmp보다 작거나 같읕 key를 갖는 항목 a[j]를 발견
// 3.드모르간 법칙 적용하여 조건 성립할때까지 반복
// 조건(1.j가 0보다 크다  2.a[j-1]값이 tmp보다 크다)

public class InsertionSort {
	static void insertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j>0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
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

		insertionSort(x, nx); // 배열 x를 버블 정렬합니다

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
		stdIn.close();
	}
}
