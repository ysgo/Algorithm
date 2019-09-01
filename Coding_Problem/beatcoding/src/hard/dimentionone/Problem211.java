package hard.dimentionone;

import java.util.Scanner;

/*
 * int형 변수를  원소로 갖는 1차원 배열을 입력받아서 배열에 저장된 원소의 최대값과 최소값을
 * 반환해주는 메소드 maxValue(int[] arr)과 minValue(int[] arr)을 작성하시오
 */
public class Problem211 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = stdIn.nextInt();
		}
		int max = maxValue(arr);
		int min = minValue(arr);
		System.out.println("최대값  : " + max);
		System.out.println("최소값  : " + min);
		stdIn.close();
	}
	static int maxValue(int[] arr) {
		int max = 0;
		for(int data : arr) {
			if(max < data)
				max = data;
		}
		return max;
	}
	static int minValue(int[] arr) {
		int min = arr[0];
		for(int data : arr) {
			if(min > data)
				min = data;
		}
		return min;
	}
}
