package hard.recursive;
/*
Enter the num : 2 2
2, 0, 0, 0, 0, 0
0, 1, 0, 0, 0, 0
주사위를 n번 던져 나온 눈의 합이 M이 나올 모든 경우를 출력 : 2
 */
import java.util.Scanner;

public class Problem250 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num : ");
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[] arr = {0, 0, 0, 0, 0, 0};
		System.out.println("주사위를 n번 던져 나온 눈의 합이 M이 나올 모든 경우를 출력 : " + diceSum(n, m, arr, 0));
		
		
		stdIn.close();
	}
	public static int diceSum(int n, int m, int[] arr, int count) {
		if(n == 1) {
			if(m >= 1 && m <= 6) {
				int[] list = new int[6];
				for(int i=0; i<6; i++) {
					list[i] = arr[i];
				}
				list[m-1]++;
				System.out.printf("%d, %d, %d, %d, %d, %d\n", 
						list[0], list[1], list[2], list[3], list[4], list[5]);
				count++;
			}
		} else {
			for(int i=1; i<=6; i++) {
				if(m-i > 0) {
					int[] list = new int[6];
					for(int j=0; j<6; j++) {
						list[j] = arr[j];
					}
					list[i-1]++;
					count = diceSum(n-1, m-1, list, count);
				} else if(m-i == 0) {
					int[] list = new int[6];
					for(int j=0; j<6; j++) {
						list[j] = arr[j];
					}
					list[m-1]++;
					System.out.printf("%d, %d, %d, %d, %d, %d\n", 
							list[0], list[1], list[2], list[3], list[4], list[5]);
					count++;
				}
			}
		}
		return count;
	}
}
