package sort;

import java.util.Scanner;

// 퀵 정렬 = 일반적으로 사용되는 아주 빠른 정렬 알고리즘으로, 찰스 앤터니 리처드 호어가 붙인 이름
// 한 그룹을 나누는 기준(=피벗)을 설정하고 그룹 나눔을 반복하면서, 모든 그룹이 1명이 되면 정렬을 마친다.

// 퀵 정렬 클래스(배열을 나누는 과정을 출력한다)
public class QuickSort1 {
	// a[idx1]와 a[idx2]의 값을 바꾼다
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;	// 왼쪽 커서
		int pr = right; // 오른쪽 커서
		int x = a[(pl+pr)/2];	// 피벗(가운데 위치 값)
		
		// 퀵 정렬할시 각 배열을 나누는 과정을 모두 출력하기
		System.out.printf("a[%d]~a[%d] : {", left, right);
		for(int i = left; i<right; i++)
			System.out.printf("%d, ", a[i]);
		System.out.printf("%d}\n", a[right]);
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		if(left < pr) quickSort(a, left, pr);
		if(pl < right) quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵 정렬");
		System.out.print("요솟 수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		quickSort(x, 0, nx-1); // 배열 x를 퀵정렬
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		stdIn.close();
	}
}
