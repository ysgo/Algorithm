package day4;

public class TwoArrayLab2 {
	public static void main(String[] args) {

//	    1��   10, 20, 30, 40, 50
//	    2��   5, 10, 15
//	    3��  11, 22, 33, 44
//	    4��  9, 8, 7, 6, 5, 4, 3, 2, 1
		
//		 1���� ���� x �Դϴ�.
//		    2���� ���� x �Դϴ�.
//		    3���� ���� x �Դϴ�.
//		    4���� ���� x �Դϴ�.
		int[][] arr = {
				{10, 20, 30, 40, 50},
				{5, 10, 15},
				{11, 22, 33, 44},
				{9, 8, 7, 6, 5, 4, 3, 2, 1}
		};		
		int count=0;
		int[] sum = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
			System.out.println(++count + "���� ���� " + sum[i] + "�Դϴ�.");
		}
		
//		for(int j=0; j<arr[0].length; j++) 
//			arr[0][j] = 10 * (j+1);
		
//		for (int i = 0; i < arr.length; i++) {
//			int result = 0;
//			for (int j = 0; j < arr[i].length; j++) {
//				result += arr[i][j];
//			}
//			System.out.println((i+1) + "���� ���� " + result + "�Դϴ�.");
//		}
	}
}
