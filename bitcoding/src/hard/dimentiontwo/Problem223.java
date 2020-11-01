package hard.dimentiontwo;
/*
배열 1 : 1 13 5 2 8 9 4 4
배열 2 : 12 7 1 2
합친 배열 >> 
1 
13 5 
2 8 9 
4 4 12 7 
1 2 0 0 0 
 */
import java.util.Scanner;

public class Problem223 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 1 : ");
		String str1 = stdIn.nextLine();
		String[] arr1_str = str1.split(" ");
		
		System.out.print("배열 2 : ");
		String str2 = stdIn.nextLine();
		String[] arr2_str = str2.split(" ");
		
		int[] arr1 = new int[arr1_str.length + arr2_str.length];
		for(int i=0; i<arr1_str.length; i++) {
			arr1[i] = Integer.parseInt(arr1_str[i]);
		}
		for(int i=0; i<arr2_str.length; i++) {
			arr1[arr1_str.length + i] = Integer.parseInt(arr2_str[i]); 
		}
		
		int count = 0;
		int row = 1;
		while(count < arr1.length) {
			row++;
			count += row;
		}
		int[][] arr2 = new int[row][];
		count = 0;
		for(int i=0; i<row; i++) {
			arr2[i] = new int[i+1];
			for(int j=0; j<i+1; j++) {
				if(count < arr1.length) {
					arr2[i][j] = arr1[count];
				}
				count++;
			}
		}
		
		System.out.println("합친 배열 >> ");
		for(int[] data : arr2) {
			for(int sub_data : data)
				System.out.print(sub_data + " ");
			System.out.println();
		}
		
		stdIn.close();
	}
}
