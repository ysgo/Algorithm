package sort;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.sort로 기본 자료형 배열의 정렬 클래스(퀵 정렬)
// sort메서드는 퀵 정렬 알고리즘을 개선한 것으로 안정적이지 않다.
// 이 말은 배열에 같은 값이 존재하는 경우 같은 값 사이의 순서가 뒤바뀔 수 있다는 말이다
public class ArraySortTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수 :");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("오름차순을 정렬했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x[" + i + "]= " + x[i]);
		
		stdIn.close();
	}
}
