package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {
	public static void main(String[] args) {
		SolutionRamenFactory su = new SolutionRamenFactory();
		int stock = 4;
		int[] dates = {4, 10 ,15};
		int[] supplies = {20, 5, 10};
		int k = 30;
		System.out.println(su.solution(stock, dates, supplies, k));
	}
}
class SolutionRamenFactory {
    public int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());
        int idx = 0;
        while(stock < k) {
//        	System.out.println("1->stock:" + stock + ", answer:" + answer + ", idx:" + idx);
        	for(int i=idx; i<dates.length; i++) {
        		if(stock >= dates[i]) {
        			qu.add(supplies[i]);
        			idx++;
        		}
        	}
        	stock += qu.poll();
        	answer++;
//        	System.out.println("2->stock:" + stock + ", answer:" + answer + ", idx:" + idx);
        }
        return answer;
    }
}