package sort;

import java.util.Scanner;

/* 도수 정렬 = 요소의 대소 관계를 판단하지 않고 빠르게 정렬할 수 있는 알고리즘
 * 각 단계에서 배열 요소를 건너뛰지 않고 순서대로 스캔하기에 같은 값에 대해 순서가 바뀌는 일이 없어 안정적인 알고리즘
 * 도수분포표가 필요하기때문에 데이터의 최솟값과 최댓값을 알고 있는 경우에만 사용한다
 * <4단계로 이루어짐>
 * 1.도수분포표 만들기
 * 2.누적도수분포표 만들기
 * 3.목적 배열 만들기
 * 4.배열 복사
 * 단, 3단계에서 배열a를 스캔시 마지막 위치부터가 아닌 처음부터 스캔을 실시하면 중복된 값의 순서가 반대로 바뀌어
 * 안정적이지 않게 된다.
*/
public class Fsort {
	static void fSort(int[] a, int n, int max) {
		// 도수 정렬(0이상 max이하의 값을 입력한다)
		int[] f = new int[max+1];	// 누적용 도수
		int[] b = new int[n];		// 작업용 목적 배열(a배열을 정렬)
		
		for(int i=0; i<n; i++) f[a[i]]++;				// 1단계:도수분포표 만들기
		for(int i=1; i<=max; i++) f[i] += f[i-1];		// 2단계:누적도수분포표 만들기
		for(int i=n-1; i>=0; i--) b[--f[a[i]]] = a[i];	// 3단계:목적 배열 만들기
		for(int i=0; i<n; i++) a[i] = b[i];				// 4단계:배열 복사하기
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("도수 정렬");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = stdIn.nextInt();
			} while(x[i] < 0);
		}
		
		int max = x[0];
		for(int i=1; i<nx; i++)
			if(x[i] > max) max = x[i];
		
		fSort(x, nx, max);		// 배열 x를 도수 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
		
		stdIn.close();
	}
}
