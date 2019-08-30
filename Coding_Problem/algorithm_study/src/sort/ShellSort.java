package sort;

import java.util.Scanner;

// 쉘 정렬 = 단순 삽입 정렬의 장점은 살리고 단점은 보완한 정렬 알고리즘(도널드 셀이 고안)
// 1.먼저 정렬할 배열의 요소를 그룹으로 나눠 각 그룹별로 단순 삽입 정렬 수행
// 2.그 그룹을 합치면서 정렬을 반복해 요소의 이동 횟수를 줄이는 방법
// * n-정렬 = n칸만틈 떨어진 요소를 모아 그룹을 나누어 정렬하는 방법 -> 4-2-1정렬 방식 사용
//시간 복잡도 = O(n^2) -> 멀리 떨어져 있는 요소를 교환해야하기에 안정하지가 않다.

public class ShellSort {
	static void shellSort(int[] a, int n) {
		for(int h=n/2; h>0; h/=2) {
			for(int i=h; i<n; i++) {
				int j;
				int tmp = a[i];
				for(j = i-h; j>=0 && a[j] > tmp; j -= h)
					a[j+h] = a[j];
				a[j+h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셀 정렬(버전 1)");
		System.out.print("요솟 수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		shellSort(x, nx); // 배열 x를 버블 정렬합니다

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);
		stdIn.close();
	}
}
