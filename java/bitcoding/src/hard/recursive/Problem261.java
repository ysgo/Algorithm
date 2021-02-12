package hard.recursive;

import java.util.Scanner;
// 파스칼의 삼각형 만들기
/* 1.n번째 줄의 숫자 칸의 갯수는 n개. 한 줄 씩 내려갈때마다 한 칸씩 많아져서 정삼각형 모양이 만들어짐
 * 2.첫 번째 줄과 두 번째 줄의 3칸에는 1을 쓴다
 * 3.세 번째 줄부터는 줄의 양쪽 끝에는 1을 쓰고 나머지 칸에는 윗 줄에 위치한 칸 중 해당 칸과 인접한 두 칸의 숫자를 더한 값을 쓴다
 */
public class Problem261 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		pascalTriangle(n);
		
		stdIn.close();
	}
	public static void pascalTriangle(int n) {
		if(n <= 0) {
			System.out.println("Number must me greater than zero");
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.printf("%3d", pascal(j, i));
			}
			System.out.println();
		}
	}
	public static int pascal(int col, int row) {
		if(col == 0 || col == row) {
			return 1;
		} else {
			return pascal(col-1, row-1) + pascal(col, row-1);
		}
	}
}
