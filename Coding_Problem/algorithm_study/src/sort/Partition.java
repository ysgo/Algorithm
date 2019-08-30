package sort;

import java.util.Scanner;

// 퀵 정렬 = 일반적으로 사용되는 아주 빠른 정렬 알고리즘으로, 찰스 앤터니 리처드 호어가 붙인 이름
// 한 그룹을 나누는 기준(=피벗)을 설정하고 그룹 나눔을 반복하면서, 모든 그룹이 1명이 되면 정렬을 마친다.

// 퀵정렬 전에 배열을 나누는 클래스
public class Partition {
	// a[idx1]와 a[idx2]의 값을 바꾼다
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열을 나눈다
	static void partition(int[] a, int n) {
		int pl = 0;	// 왼쪽 커서
		int pr = 0; // 오른쪽 커서
		int x = a[n/2];	// 피벗(가운데 위치 값)
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		System.out.println("피벗의 값은 " + x + "입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<=pl-1; i++)		// a[0] ~ a[pl-1]
			System.out.print(a[i] + " ");
		System.out.println();
		
		if(pl > pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1; i<=pl-1; i++) 	// a[pr+1] ~ a[pl-1]
				System.out.print(a[i] + " ");
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i=pr+1; i<n; i++)
			System.out.print(a[i] + " ");	// a[pr+1] ~ a[n-1]
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("배열을 나눕니다");
		System.out.print("요솟 수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		partition(x, nx); // 배열 x를 나눈다

		stdIn.close();
	}
}
