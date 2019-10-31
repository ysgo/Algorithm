package sort;

import java.util.Scanner;

import stack_queue.IntStack;

// 퀵 정렬 = 일반적으로 사용되는 아주 빠른 정렬 알고리즘으로, 찰스 앤터니 리처드 호어가 붙인 이름
// 한 그룹을 나누는 기준(=피벗)을 설정하고 그룹 나눔을 반복하면서, 모든 그룹이 1명이 되면 정렬을 마친다.
// 비재귀적 방법의 개선방법
// 1.요소의 개수가 많은 그룹을 먼저 푸시할시 스택에 쌓이는 최대 개수가 적음(최대 데이터 개수를 줄일 수 있음
// 요소 개수가 n개일시 스택에 쌓이는 최대 개수는 logn보다 적다.
// 2.요소의 개수가 적은 구릅을 먼저 푸시한다면 쌓이는 데이터가 더 많고 분할 횟수가 더 많아져서 1번이 더 효율적이다.


// 퀵 정렬 클래스(비재귀적인 방법으로 구현한 클래스)
public class QuickSort2 {
	// a[idx1]와 a[idx2]의 값을 바꾼다
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 퀵 정렬
	static void quickSort(int[] a, int left, int right) {
		// 나눌 범위의 왼쪽 끝 요소의 인덱스를 저장하는 스택
		IntStack lstack = new IntStack(right - left + 1);
		// 나눌 범위의 오른쪽 끝 요소의 인덱스를 저장하는 스택
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop();	// 왼쪽 커서
			int pr = right = rstack.pop(); // 오른쪽 커서
			int x = a[(left+right)/2];	// 피벗(가운데 위치 값)
			
			do {
				while(a[pl] < x) pl++;
				while(a[pr] > x) pr--;
				if(pl <= pr)
					swap(a, pl++, pr--);
			} while(pl <= pr);
			
			if(left < pr) {
				lstack.push(left);	// 왼쪽 그룹 범위의
				rstack.push(pr);	// 인덱스를 푸시
			}
			if(pl < right) {
				lstack.push(pl);	// 오른쪽 그룹 범위의
				rstack.push(right);	// 인덱스를 푸시
			}
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵 정렬(비재귀적 버전)");
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
