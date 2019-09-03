package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ControlCamera_OtherSol {
	public static void main(String[] args) {
		SolutionControlCamera_OtherSol su = new SolutionControlCamera_OtherSol();
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
class SolutionControlCamera_OtherSol {
    public int solution(int[][] routes) {
        int answer = 1;
        Arrays.sort(routes, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
        });
        for(int i=0; i<routes.length; i++) {
        	for(int j=0; j<routes[0].length; j++) {
        		System.out.print(routes[i][j]);
        	}
        	System.out.println();
        }
        int min = routes[0][routes[0].length-1];
        System.out.println(min);
        
        for(int i=0; i<routes.length; ++i) {
        	if(min < routes[i][0]) {
        		answer++;
        		min = routes[i][1];
        	} else {
        		min = Math.min(min, routes[i][1]);
        	}
        }
        return answer;
        
        /* 2번째
         * Arrays.sort(routes, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] <= o2[0]){
                    return -1;
                }
                return 1;
            }
        });

        int answer = 0;
        int last = routes[0][1];
        for(int i=1; i<routes.length; i++){

            if(routes[i][0] <= last){
                if(last >= routes[i][1]){
                    last = routes[i][1];                  
                }
            }else{
                answer += 1;
                last = routes[i][1];
            }

        }
        answer += 1;

        return answer;
         */
        
        
        /* 3번째
         * Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0;
        int last_camera = Integer.MIN_VALUE;
        for (int[] a : routes) {
            if (last_camera < a[0]) {
                ++ans;
                last_camera = a[1];
            }
        }
        return ans;
         */
    }
}