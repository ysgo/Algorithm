package hard.dimentiontwo;
/*
배열 1 : 1 3 5 2 8
배열 2 : 2 4 7 1
합친 배열 >> 
1 3 
5 2 
8 2 
4 7 
1 0 
 */
import java.util.Scanner;

public class Problem222 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 1 : ");
		String str1 = sc.nextLine();
		String[] arr1_str = str1.split(" ");
		
		System.out.print("배열 2 : ");
		String str2 = sc.nextLine();
		String[] arr2_str = str2.split(" ");
		
		int[] arr1 = new int[arr1_str.length + arr2_str.length];
		for(int i=0; i<arr1_str.length; i++) {
			arr1[i] = Integer.parseInt(arr1_str[i]);
		}
		for(int i=0; i<arr2_str.length; i++) {
			arr1[arr1_str.length + i] = Integer.parseInt(arr2_str[i]); 
		}
		
		int row_length = arr1.length / 2 + 1;
		int[][] arr2 = new int[row_length][2];
		for(int i=0; i<arr1.length; i++) {
			arr2[i/2][i%2] = arr1[i];
		}
		System.out.println("합친 배열 >> ");
		for(int[] data : arr2) {
			for(int sub_data : data)
				System.out.print(sub_data + " ");
			System.out.println();
		}
		sc.close();
	}
}
