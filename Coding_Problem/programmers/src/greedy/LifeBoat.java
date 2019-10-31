package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LifeBoat {
	public static void main(String[] args) {
		SolutionLifeBoat su = new SolutionLifeBoat();
		int[] people = { 70, 50, 80, 50 };	// 3
//		int[] people = { 70, 50, 80, 50, 40, 120, 90, 50 };	// 6
//		int[] people = { 70, 80, 50 };
		int limit = 100;
		System.out.println(su.solution(people, limit));
	}
}

class SolutionLifeBoat {
	public int solution(int[] people, int limit) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			list.add(people[i]);
		}
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
			}
		});
		System.out.println(list);
		
		int answer = people.length;
		System.out.println(answer);
		int j = list.size()-1;
		System.out.println(j);
		for(int i=0; i<j; i++) {
			System.out.println(i + "  " + j);
			if(list.get(i) + list.get(j)<= limit) {
				System.out.println(i + "  " + j);
				answer--;
				j--;
			}
		}
		return answer;
//		스택으로 해봤지만 실패한 코드		
//		int result = people.length;
//		Stack<Integer> stack = new Stack<>();
//		stack.addAll(list);
//		while(!stack.isEmpty()) {
//			int pop = stack.pop();
//			for(int i=stack.size()-1; i>=0; i--) {
//				if(pop + stack.get(i) <= limit) {
//					result--;
//					stack.pop();
//					break;
//				}
//			}
//		}
//		return result;		
	}
}