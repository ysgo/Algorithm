package core_problem;

import java.util.ArrayList;
import java.util.Scanner;

// 기출문제

public class Group_Sequence {
	public static void main(String[] args) {
		/*
		 * ## 문제 3(100점)
		 * 
		 * 문제 설명 수열을 어떤 규칙에 의해 여러 가지 항으로 나누었을 때, 각각의 항으로 이루어진 수열을 군수열이라고 합니다.
		 * 
		 * 무한수열 S = (1), (1, 2), (1, 2, 3), (1, 2, 3, 4).... 입니다. 이 수열의 규칙은 다음과 같습니다.
		 * 
		 * N 번째 군에는 1부터 N까지의 자연수가 크기 순서대로 있습니다. 수열의 k 번째 항은, 군에 상관없이 맨 앞부터 세기 시작합니다. 즉,
		 * 수열 S의 4번째 항은 1이 됩니다. 수 k가 주어질 때, 수열 S에서 k 번째 항의 수를 반환하는 solution 함수를 완성하세요.
		 * 
		 * 제한사항 k는 50,000,000,000,000 이하의 자연수입니다.
		 */
		int j = 1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> stack = new ArrayList<Integer>(); // 무한수열 스택
		int k = sc.nextInt();
		while (j < k) {
			for(int i=0; i<j;) {
				if (stack.isEmpty()) {
					stack.add(j);
					i++;
				} else {
					stack.add(++i);
				}
			}
			j++;
		}
//		for(int i=0; i<stack.size(); i++) {
//			if(stack.get(i) == 1) {
//				System.out.print("(" + stack.get(i));
//				if(stack.get(i+1) == 1)
//					System.out.print(")");
//				else
//					System.out.print(", ");
//			} else {
//				if(stack.)
//					System.out.print(stack.get(i) + ")");
//				
//			}		
//		}
		System.out.println(stack);
		System.out.println(stack.get(k-1));
		sc.close();
	}
}
