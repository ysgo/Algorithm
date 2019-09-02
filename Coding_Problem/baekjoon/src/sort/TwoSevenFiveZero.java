package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoSevenFiveZero {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] array = new int[num];
		// 입력 값 배열 만들기
		for(int i=0; i<num; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
//		bubbleSort(array, num);
		insertSort(array, num);
		for(int data : array)
			System.out.print(data + " ");
	}
	// 버블 정렬하기
	static void bubbleSort(int[] array, int num) {
		for(int i=0; i<num-1; i++) {
			for(int j=num-1; j>i; j--) {
				if(array[j-1] > array[j]) {
					swap(array, j-1, j);
				}
			}
		}
	}
	
	// 삽입 정렬하기
	static void insertSort(int[] array, int num) {
		for(int i=1; i<num; i++) {
			int j;
			int tmp = array[i];
			for(j=i; j>0 && tmp < array[j-1]; j--) {
				array[j] = array[j-1];
			}
			array[j] = tmp;
		}
	}
	
	// 수 교환하기
	static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
