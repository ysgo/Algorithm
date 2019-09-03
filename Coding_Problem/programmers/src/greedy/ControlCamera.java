package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class ControlCamera {
	public static void main(String[] args) {
		SolutionControlCamera su = new SolutionControlCamera();
		int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
//		int[][] routes = {{-2,-1}, {1,2}, {-3,0}};	// 2
//		int[][] routes = {{0,0}};	// 1
//		int[][] routes = {{0,1}, {0,1}, {1,2}};	// 1
//		int[][] routes = {{0,1}, {2,3}, {4, 5}, {6, 7}};	// 4
//		int[][] routes = {{-20,15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
//		int[][] routes = {{-20,-15}, {-20, 15}, {-14,-5}, {-18,-13}, {-5,-3}};	// 2
		System.out.println(su.solution(routes));
	}
}
class SolutionControlCamera {
    public int solution(int[][] routes) {
    	int answer = 0;
	    Arrays.sort(routes, new Comparator<int[]>() {
	    	@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
	    });
        int min=routes[0][1];
        System.out.println(min);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(min, 0);
        for(int i=0; i<routes.length; i++) {
        	if(min >= routes[i][0] & min <= routes[i][1]) {
        		map.put(min, map.get(min)+1);
        	} else {
        		min = routes[i][1];
        		map.put(min, 0);
        	}
        	System.out.println("map : " + map + ", answer : " + answer);
        }
        answer += map.size();
        return answer;
    }
}