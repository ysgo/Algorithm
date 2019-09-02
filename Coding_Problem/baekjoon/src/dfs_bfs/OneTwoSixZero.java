package dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 인접행렬를 이용한 그래프 DFS, BFS 해결
public class OneTwoSixZero {
	static int[][] graph;
	static boolean[] visit;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();	// 정점 개수
		int M = stdIn.nextInt();	// 간선 개수
		int V = stdIn.nextInt();	// 탐색 시작 정점 번호
		
		// 정점 만들기
		graph = new int[N+1][N+1];
		for(int i=0; i<N+1; i++) {
			Arrays.fill(graph[i], 0);
		}
		// 방문 여부
		visit = new boolean[N+1];
		// 정점과 간선으로 이루어진 그래프 만들기
		for(int i=0; i<M; i++) {
			int num1 = stdIn.nextInt();
			int num2 = stdIn.nextInt();
			
			graph[num1][num2] = 1;
			graph[num2][num1] = 1;
		}
		// 깊이 우선 탐색
		dfs(N, M, V);
		// 방문 여부 초기화
		Arrays.fill(visit, false);
		System.out.println();
		// 너비 우선 탐색
		bfs(N, M, V);
		
		stdIn.close();
	}
	public static void dfs(int N, int M, int V) {
		if(visit[V] == true) return;
		visit[V] = true;
		System.out.print(V+" ");
		for(int i=1; i<N+1; i++) {
			if(graph[V][i] == 1 && visit[i] == false) {
				dfs(N, M, i);
			}
		}
	}
	public static void bfs(int N, int M, int V) {
		visit[V] = true;
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(V);
		while(!qu.isEmpty()) {
			int tmp = qu.poll();
			System.out.print(tmp+" ");
			for(int i=1; i<=N; i++) {
				if(graph[tmp][i] == 1 && visit[i]==false) {
					qu.offer(i);
					visit[i] = true;
				}
			}
		}
	}
}