package greedy;

/* 최소 비용 신장 트리(Mininum Spanning Tree)를 구하는 알고리즘
 * 1.프림 알고리즘(코드 구현이 용이함)
 * 2.크루스칼 알고리즘(이해하기 어렵고 구현이 어려움. 코드길이나 효율이 좋음)
 */
// 최소신장비용트리 공부
// 정의 : 각 정점을 모두 연결하면서 가장 낮은 비용으로 연결된 신장트리
// 개념
// 1.https://gmlwjd9405.github.io/2018/08/28/algorithm-mst.html
// 2.http://blog.naver.com/PostView.nhn?blogId=ssarang8649&logNo=220992988177
// 코드 : https://118k.tistory.com/480

public class ConnectIsland {
	public static void main(String[] args) {
		SolutionConnectIsland su = new SolutionConnectIsland();
		int n = 4;
		int[][] costs = {{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}};	// 4
//		int n = 4;
//		int[][] costs = {{0,1,1}, {0,2,2}, {2, 3, 1}};	// 4
//		int n = 6;
//		int[][] costs = {{0, 1, 5}, {0, 3, 2}, {0, 4, 3}, {1, 4, 1}, 
//						{3, 4, 10}, {1, 2, 2}, {2, 5, 3}, {4, 5, 4}};	// 11
		System.out.println(su.solution(n, costs));
	}
}
class SolutionConnectIsland {
    public int solution(int n, int[][] costs) {
    	
    	// 배열을 새로 만든 이유는 각 costs배열의 각 섬들만큼 인덱스를 움직여야하기에 새로 생성해야함
    	// 기존 costs로 사용할시 Index범위 초과가 되서 에러가 남
    	int[][] map = new int[n][n];
		for (int i = 0; i < costs.length; i++) {
			map[costs[i][0]][costs[i][1]] = costs[i][2];
			map[costs[i][1]][costs[i][0]] = costs[i][2];
		}
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int answer = prim(map, visited, 0, 1);
        return answer;
    }
    static int prim(int[][] map, boolean[] visited, int value, int count) {
    	if(count == visited.length) {
    		return value;
    	}
    	int to = -1;
    	int min = Integer.MAX_VALUE;
    	
    	for(int i=0; i<visited.length; i++) {
    		if(visited[i] == true) {
    			for(int j=0; j<map.length; j++) {
    				if(visited[j] == false && map[i][j] != 0 && min > map[i][j]) {
    					to = j;
    					min = map[i][j];
    				}
    				System.out.println("i:" + i + ", j:" + j + ", to:" + to + ", min:" + min);
    			}
    		}
    	}
    	
    	visited[to] = true;
    	value += min;
    	count++;
    	
    	System.out.println("value:" + value + ", count:" + count);
    	return prim(map, visited, value, count);
    }
}