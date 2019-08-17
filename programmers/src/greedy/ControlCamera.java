package greedy;

import java.util.HashMap;

public class ControlCamera {
	public static void main(String[] args) {
		SolutionControlCamera su = new SolutionControlCamera();
//		int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
//		int[][] routes = {{-2,-1}, {1,2}, {-3,0}};	// 2
//		int[][] routes = {{0,0}};	// 1
//		int[][] routes = {{0,1}, {0,1}, {1,2}};	// 1
//		int[][] routes = {{0,1}, {2,3}, {4, 5}, {6, 7}};	// 4
//		int[][] routes = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
		int[][] routes = {{-20,-15}, {-20, 15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
		System.out.println(su.solution(routes));
	}
}
class SolutionControlCamera {
    public int solution(int[][] routes) {
        int answer = 0;
        int max=routes[0][0]; int min=routes[0][1];
        for(int i=1; i<routes.length; i++) {
        	max = Math.max(max, routes[i][0]);
        	min = Math.min(min, routes[i][1]);
        }
        System.out.println(max);
        System.out.println(min);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(min, 0);
        map.put(max, 0);
        for(int i=0; i<routes.length; i++) {
        	if(max == min) {
        		return 1;
        	}
        	if(min >= routes[i][0] & min <= routes[i][1]) {
        		map.put(min, map.get(min)+1);
        	} else if(max >= routes[i][0] & max <= routes[i][1]) {
        		map.put(max, map.get(max)+1);
        	} else {
        		answer++;
        	}
        }
        System.out.println("map : " + map + ", answer : " + answer);
        answer += map.size();
        return answer;
    }
}