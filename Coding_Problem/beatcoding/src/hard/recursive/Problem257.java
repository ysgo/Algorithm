package hard.recursive;

import java.util.Scanner;

public class Problem257 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter N : ");
		int N = stdIn.nextInt();
		System.out.print("Enter x : ");
		int x = stdIn.nextInt();
		System.out.print("Enter y : ");
		int y = stdIn.nextInt();
		
		System.out.print("결과 : " + Zarray(x, y, 1, 1, N, 0));
		
		stdIn.close();
	}
	public static int Zarray(int o_x, int o_y, int x, int y, int n, int count) {
		System.out.println(o_x + " " + o_y + " " + " " + x + " " + y + " " + n + " " + count);
		if(n == 1) {
			if(o_x == x && o_y == y) {
				return count;
			}
			count++;
			if(o_x == x+1 && o_y == y) {
				return count;
			}
			count++;
			if(o_x == x && o_y == y+1) {
				return count;
			}
			count++;
			if(o_x == x+1 && o_y == y+1) {
				return count;
			}
			count++;
			return -1;
		}
		
		int N = (int)Math.pow(2, n-1);
		int v1 = Zarray(o_x, o_y, x, y, n-1, count);
		if(v1 == -1) { count += (int)Math.pow(4, n-1); }
		else { return v1; }
		
		int v2 = Zarray(o_x, o_y, x+N, y, n-1, count);
		if(v2 == -1) { count += (int)Math.pow(4, n-1); }
		else { return v2; }
		
		int v3 = Zarray(o_x, o_y, x, y+N, n-1, count);
		if(v3 == -1) { count += (int)Math.pow(4, n-1); }
		else { return v3; }

		int v4 = Zarray(o_x, o_y, x+N, y+N, n-1, count);
		if(v4 == -1) { count += (int)Math.pow(4, n-1); }
		else { return v4; }
		
		return -1;
	}
}
