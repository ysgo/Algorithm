package hard.random;

import java.util.Random;
import java.util.Scanner;

public class Problem198 {
	/* 이항분포문제
	 * p의 확룔로 성공하는 사건 n번 실행할경우 이 때 사건이 성공하는 횟수에 따르는 분포를 말한다.
	 * 이러한 분포를 (n,p)를 따르느 이항분포라한다
	 * 문제 : n번의 0부터 1사이의 난수를 발생시켜 p보다 큰 수가 나온 횟수를 구하시오.
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		double p = stdIn.nextDouble();
		stdIn.close();
		System.out.println(rBinom(n, p));
	}
	public static int rBinom(int n, double p) {
		int count=0;
		Random rd = new Random();
		for(int i=0; i<n; i++) {
			if(rd.nextDouble() > p)
				count++;
		}
		return count;
	}
}
