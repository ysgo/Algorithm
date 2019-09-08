package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FailureRate {
	public static void main(String[] args) {
		SolutionFailureRate su = new SolutionFailureRate();
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};	// {3, 4, 2, 1, 5}
//		int N = 4;	
//		int[] stages = {4, 4, 4, 4, 4};				// {4, 1, 2, 3}
		System.out.print("[ ");
		for(int data : su.solution(N, stages))
			System.out.print(data + " ");
		System.out.println("]");
	}
}
class SolutionFailureRate {
    public int[] solution(int N, int[] stages) {
        int stageNum = 1;
        double unClear = 0;
        double stageReach = stages.length;
        double failRate;
        Map<Integer, Double> map = new HashMap<>();
        while(stageNum<= N) {
        	unClear = countFail(stageNum, stages);
        	failRate = unClear / stageReach;
        	map.put(stageNum, failRate);
        	
        	stageReach -= unClear;
        	stageNum++;
        }
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
        });
        int[] answer = new int[map.size()];
        int idx = 0;
        for(Integer key : keySetList) {
            answer[idx++] = key;
        }
        return answer;
    }
    
    static int countFail(int stageNum, int[] stages) {
    	int count = 0;
    	for(int i=0; i<stages.length; i++) {
    		if(stages[i] == stageNum) {
    			count++;
    		}
    	}
    	return count;
    }
}