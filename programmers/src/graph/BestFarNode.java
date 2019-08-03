package graph;

import java.util.LinkedList;
import java.util.Queue;

/*
 * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 
 * 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 
 * 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.

노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때,
 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.

제한사항
노드의 개수 n은 2 이상 20,000 이하입니다.
간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
입출력 예
n	vertex														return
6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
입출력 예 설명
예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드입니다. */
public class BestFarNode {
	public static void main(String[] args) {
		SolutionBestFarNode su = new SolutionBestFarNode();
		int n = 6;
		int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};	// 3
		System.out.println(su.solution(n, edge));
	}
}
class SolutionBestFarNode {
    public int solution(int n, int[][] edge) {
    	int answer = 0;
    	boolean[] visited = new boolean[n+1];
    	Queue<Integer> qu = new LinkedList<Integer>();
    	qu.add(1);
    	visited[1] = true;
    	while(!qu.isEmpty()) {
    		answer = qu.size();
    		for(int j=0; j<answer; j++) {
    			int tmp = qu.poll();
    			for(int i=0; i<edge.length; i++) {
    				if(edge[i][0] == tmp && !visited[edge[i][1]]) {
    					qu.add(edge[i][1]);
    					visited[edge[i][1]] = true;
    				} else if(edge[i][1] == tmp && !visited[edge[i][0]]) {
    					qu.add(edge[i][0]);
    					visited[edge[i][0]] = true;
    				}
    			}    			
    		}
    	}
    	return answer;
    }
}
/* 통과했지만 시간이 5000ms대가 나와서 다시 구현
 boolean[] visited = new boolean[n+1];
    	Queue<Integer> qu = new LinkedList<Integer>();
    	qu.add(1);
    	visited[1] = true;
    	while(!qu.isEmpty()) {
    		answer = qu.size();
    		for(int j=0; j<answer; j++) {
    			int tmp = qu.poll();
    			for(int i=0; i<edge.length; i++) {
    				if(edge[i][0] == tmp && !visited[edge[i][1]]) {
    					qu.add(edge[i][1]);
    					visited[edge[i][1]] = true;
    				} else if(edge[i][1] == tmp && !visited[edge[i][0]]) {
    					qu.add(edge[i][0]);
    					visited[edge[i][0]] = true;
    				}
    			}    			
    		}
    	}
 */

