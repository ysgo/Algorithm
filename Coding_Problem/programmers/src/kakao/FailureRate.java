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
//		int N = 6;
//		int[] stages = {1, 1, 4, 3, 3, 5, 3, 5};	// {3, 4, 2, 1, 5}
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
        int stageReach = stages.length;
        Map<Integer, Integer> usrNum = new HashMap<>();
        Map<Integer, Double> fail = new HashMap<>();
        for(Integer data : stages) {
        	int count = usrNum.containsKey(data) ? usrNum.get(data) + 1 : 1;
        	usrNum.put(data, count);
        }
        while(stageNum<= N) {
        	if(usrNum.containsKey(stageNum)) {
        		fail.put(stageNum, (double)(usrNum.get(stageNum))/stageReach);
        		stageReach -= usrNum.get(stageNum);
        	} else {
        		fail.put(stageNum, 0.0);
        	}
        	stageNum++;
        }
        List<Integer> keySetList = new ArrayList<>(fail.keySet());
        Collections.sort(keySetList, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return fail.get(o2).compareTo(fail.get(o1));
			}
        });
        
        int[] answer = new int[fail.size()];
        int idx = 0;
        for(Integer key : keySetList) {
            answer[idx++] = key;
        }
        return answer;
    }
}