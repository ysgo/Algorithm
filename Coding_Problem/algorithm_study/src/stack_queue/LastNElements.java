package stack_queue;

import java.util.Scanner;

// 링 버퍼(오래된 데이터를 버리는 용도로 사용)를 활용하는 클래스
public class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];	// 입력 받을 값을 저장
		int cnt = 0;			// 입력 받은 개수
		int retry;				// 다시 한번?
		
		System.out.println("정수를 입력하세요.");
		
		do {
			System.out.printf("%d번째 정수 : ", cnt + 1);
			a[cnt++ % N] = stdIn.nextInt();
			
			System.out.print("계속 할까요? (예.1/아니오.0) : ");
			retry = stdIn.nextInt();
		} while(retry == 1);
		
		int i = cnt - N;
		if(i < 0) i = 0;
		
		for( ; i<cnt; i++) {
			System.out.printf("%2d번째의 정수=%d\n", i+1, a[i % N]);
		}
		stdIn.close();
	}
}
