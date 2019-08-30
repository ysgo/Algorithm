package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
	public static void main(String[] args) {
		SolutionDoublePriorityQueue su = new SolutionDoublePriorityQueue();
//		String[] operations = {"I 16", "D 1"};	// [0, 0]
//		String[] operations = {"I 7", "I 5", "I -5", "D -1"};	// [7, 5]
		String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};	// [0, 0]
//		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};	// [333, -45]
		int i = 0;
		for(int data : su.solution(operations)) {
			if(i++ == 0) {
				System.out.print("[" + data + ", ");
			} else {
				System.out.println(data + "]");
			}
		}
			

	}
}
class SolutionDoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        String[] s;
        int num = 0;
        for(String data : operations) {
        	s = data.split(" ");
        	num = Integer.parseInt(s[1]);
        	if(s[0].equals("I")) {
        		max.add(num);
        		min.add(num);
        	} else if(s[0].equals("D")) {
        		if(num == 1) {
        			min.remove(max.poll());
        		} else {
        			max.remove(min.poll());
        		}
        	}
        }
        if(max.size() != 0 && min.size() != 0) {
        	answer[0] = max.poll();
        	answer[1] = min.poll();
        } else {
        	answer[0] = 0; answer[1] = 0;
        }
        return answer;
    }
}