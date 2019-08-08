package recursive;

import java.util.Scanner;

/* 하노이의 탑 재귀적으로 구현
 분할 정복법
 	정의 : 하노이의 탑이나 8퀸 문제처럼 문제를 세분하고 세분된 작은 문제의 풀이를 결합해 전체 문제를 풀이하는 기법
	종류 : 하노이의 탑, 8퀸, 퀵 정렬, 병합 정렬 등
 문제를 세분할 때는 작은 문제의 풀이에서 원래 문제의 풀이가 쉽게 도출될 수 있게 설계해야 한다 */
public class Hanoi {
	// no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no - 1, x, 6 - x - y);
		
		System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
		
		if(no > 1)
			move(no - 1, 6 - x - y, y);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 : ");
		int n = stdIn.nextInt();
		
		move(n, 1, 3);		// 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
		
		stdIn.close();
	}
}
