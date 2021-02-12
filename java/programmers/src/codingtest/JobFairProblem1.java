package codingtest;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class JobFairProblem1 {
	public static void main(String[] args) {
		SolutionJobFairProblem1 su = new SolutionJobFairProblem1();
		int[] goods = {5, 3, 7};
		int[] boxes = {3, 7, 6};	// 3
//		int[] goods = {1, 2};
//		int[] boxes = {2, 3, 1};	// 2
//		int[] goods = {3, 8, 6};
//		int[] boxes = {5, 6, 4};	// 2
//		System.out.println(su.solution(goods, boxes));
		System.out.println(su.solution1(goods, boxes));
	}
}
class SolutionJobFairProblem1 {
	// 효율성 통과, 정확성 5개 실패
	public int solution1(int[] goods, int[] boxes){
		int answer = 0;
		PriorityQueue<Integer> q_goods = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> q_boxes = new PriorityQueue<>(Comparator.reverseOrder());
		for(int data : goods)
			q_goods.add(data);
		for(int data : boxes)
			q_boxes.add(data);
		while(!q_goods.isEmpty()) {
			int good = q_goods.poll();
			int box = q_boxes.poll();
//			System.out.println(good + " " + box);
			if(good <= box) {
				answer++;
			} else {
				q_boxes.add(box);
			}
		}
		return answer;
	}
	// 정확성 통과, 시간초과.....
    public int solution(int[] goods, int[] boxes){
        int answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for(int data : boxes)
        	qu.add(data);
        LinkedList<Integer> list;
        for(int data : goods) {
        	list = new LinkedList<>();
        	while(!qu.isEmpty()) {
        		int tmp = qu.poll();
        		if(data <= tmp) {
        			answer++;
        			break;
        		} else {
        			list.add(tmp);
        		}
        	}
        	qu.addAll(list);
        }
        return answer;
    }
}
