package hard.recursive;
/*
Enter the num1 : 2
Enter the num2 : 5
Between Num Colatz conject answer : 3
 */
import java.util.Scanner;

public class Problem248 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the num1 : ");
		int n = stdIn.nextInt();
		System.out.print("Enter the num2 : ");
		int m = stdIn.nextInt();
		if(n > m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		
		int max_colatz = n;
		int len_max = colatzBetween(n, 1);
		for(int i=n; i<=m; i++) {
			int val = colatzBetween(i, 1);
			if(len_max < val) {
				max_colatz = i;
				len_max = val;
			}
		}
		System.out.println("Between Num Colatz conject answer : " + max_colatz);
		stdIn.close();
		
	}
	public static int colatzBetween(int num, int count) {
		if(num != 1 && num %2 == 0) {
			count = colatzBetween(num/2, count+1);
		} else if(num != 1 && num %2 == 1) {
			count = colatzBetween(3*num+1, count+1);
		}
		return count;
	}
}
