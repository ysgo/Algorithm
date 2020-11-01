package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Line2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		int k = sc.nextInt();
		int[] arr = new int[numbers.length];
		for(int i=0; i<arr.length; i++) {
        	arr[i] = Integer.parseInt(numbers[i]);
		}
		Set<Integer> set = new HashSet<>();
		for(int i=1; i<=arr.length; i++) {
			permutation(set, arr, 0, i);
		}
//		System.out.println(set);
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
//		System.out.println(list);
		System.out.println(list.get(k-1));
        sc.close();
	}
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	static void permutation(Set<Integer> set, int[] arr, int index, int r) {
		if(index == r && r == arr.length)
			set.add(createInteger(arr, r));
		else {
			for(int i=0; i+index < arr.length; i++) {
				swap(arr, index, index+i);
				permutation(set, arr, index+1, r);
				swap(arr, index, index+i);
			}
		}
	}
	static int createInteger(int[] arr, int r) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<r; i++)
			sb.append(arr[i]);
//		System.out.println("r : " + r + "sb : " + sb.toString());
		return Integer.parseInt(sb.toString());
	}
}
