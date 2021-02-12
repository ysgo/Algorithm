package hard.recursive;

import java.util.Scanner;
// 하노이의 탑 이동하기
public class Problem254 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();			// 4
		char from = stdIn.next().charAt(0);	// 'A'
		char by = stdIn.next().charAt(0);	// 'B'
		char to = stdIn.next().charAt(0);	// 'C'
		hanoi(n, from, by, to); 
		
		stdIn.close();
	}
	static void hanoi(int n, char from, char by, char to) {
		if(n == 1) move(from, to, n);
		else {
			hanoi(n-1, from, to, by);
			move(from, to, n);
			hanoi(n-1, by, from, to);
		}
	}
	static void move(char a, char b, int n) {
		System.out.println(n + "이동 " + a + "->" + b);
	}
}
