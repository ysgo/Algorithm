package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OneOneSevenTwoFour {
	static int N;
	static int M;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws Exception {
		int answer = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		visited = new boolean[N+1];
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = arr[y][x] = 1;
		}
		System.out.println("[ Graph ]");
		printGraph();
		System.out.println();
		
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				answer++;
				dfs(i);
			}
		}
		System.out.println("Answer by DFS : " + answer);
		
		answer = 0;
		Arrays.fill(visited, false);
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				answer++;
				bfs(i);
			}
		}
		
		System.out.println("Answer by BFS : " + answer);
	}
	static void bfs(int node) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(node);
		visited[node] = true;
		
		while(!qu.isEmpty()) {
			int tmp = qu.poll();
			for(int i=1; i<=N; i++) {
				if(arr[tmp][i] == 1 && !visited[i]) {
					qu.add(i);
					visited[i] = true;
				}
			}
		}
	}
	static void dfs(int node) {
		visited[node] = true;
		
		for(int i=1; i<=N; i++) {
			if(arr[node][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	static void printGraph() {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
