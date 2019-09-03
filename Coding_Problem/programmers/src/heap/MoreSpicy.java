package heap;

import java.util.PriorityQueue;

public class MoreSpicy {
	public static void main(String[] args) {
		SolutionMoreSpicy su = new SolutionMoreSpicy();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
//		int[] scoville = { 3 };
//		int[] scoville = {8, 8, 8, 9, 10, 12};
		int K = 7; // 2
		System.out.println("힙 문제(더 맵게) 답 : " + su.solution(scoville, K));
	}
}

class SolutionMoreSpicy {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> qu = new PriorityQueue<>();
		for (int data : scoville) {
			qu.add(data);
		}
//		System.out.println(qu);
		while (qu.size() > 0) {
			int min = qu.poll();
			if (min < K) {
				if(qu.size() == 0) {
					return -1;
				}
				int sum = min + qu.poll() * 2;
				qu.add(sum);
//				System.out.println(qu);
			} else {
				break;
			}
			answer++;
		}
		return answer;
	}
}