package sort;

import java.util.Scanner;

// 퀵 정렬 = 일반적으로 사용되는 아주 빠른 정렬 알고리즘으로, 찰스 앤터니 리처드 호어가 붙인 이름
// 한 그룹을 나누는 기준(=피벗)을 설정하고 그룹 나눔을 반복하면서, 모든 그룹이 1명이 되면 정렬을 마친다.

// 배열을 조금씩 나누어 보다 작은 문제를 해결하는 과정을 반복
// 시간 복잡도 = O(nlogn)
// 단, 정렬한 배열의 초깃값과 피벗의 선택 방법에 따라 증가할 수 있음
// 예로 매번 단 하나의 요소와 나머지 요소로 나누어진다면 n번의 분할이 필요함 = O(n^2) 

/* 
 * 퀵 정렬을 할시 나눌 그룹 크기가 치우치는 것과 나눌때 스캔할 요소를 3개씩 줄일수 있는 방법
 * 1.나눌 배열의 요소 개수가 3이상이면 임의 요소 3개를 선택하고 그 중 중앙값인 요소를 피벗으로 선택
 * 2.나눌 배열의 처음, 가운데, 끝 요소를 정렬한 후 가운데와 끝에서 두번째 요소를 교환한다.
 * 그 후 피벗으로 끝에서 두번째 요소의 값(a[right-1])을 선택해 나눌 대상의 범위를 a[left+1]~a[right-2]로 좁힌다 
 */

// 퀵 정렬 클래스
public class QuickSort {
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
