package codingtest;

import java.util.Scanner;

public class Line4 {
	static int distance;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(sc.next());
        }
//        int[] arr=  new int[loc.length];
//        System.out.println(N);
//        for(int i=0; i<arr.length; i++) {
//        	arr[i] = Integer.parseInt(loc[i]);
//        	System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        distance = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 1) continue;
        	int left = 0; int right = 0;
        	left = leftDistance(arr, i, distance);
        	right= rightDistance(arr, i, distance);
        	if(left == right) {
        		if(distance < left) distance = left;
        	}
//        	System.out.println("i : " + i + ", distance : " + distance + ", left : " + left + ", right : " + right);
        }
        System.out.println(distance);
        sc.close();
	}
	static int leftDistance(int[] arr, int n, int distance) {
		int cnt = 0;
		for(int i=n-1; i>=0; i--) {
			cnt++;
			if(arr[i] == 1) break;
		}
		distance = distance >= cnt ? distance : cnt;
		return distance;
	}
	static int rightDistance(int[] arr, int n, int distance) {
		int cnt = 0;
		for(int i=n+1; i<arr.length; i++) {
			cnt++;
			if(arr[i] == 1) break;
		}
		distance = distance >= cnt ? distance : cnt;
		return distance;
	}
}
