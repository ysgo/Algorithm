package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OneOneSevenTwoFour_NearList {
	static ArrayList<ArrayList<Integer>> arr;
	static boolean[] visited;
	static Queue<Integer> qu;
	static int answer;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		answer = 0;
		arr = new ArrayList<>();
		for(int i=0; i<n+1; i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		printGraphToAdjList();
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				dfs(i);
				answer++;
			}
		}
		System.out.println("Answer by DFS : " + answer);
		Arrays.fill(visited, false);
		answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(!visited[i]) {
				bfs(i);
				answer++;
			}
		}
		System.out.println("Answer by BFS : " + answer);
	}
	static void dfs(int n) {
		visited[n] = true;
		for(int i=0; i<arr.get(n).size(); i++) {
			int next = arr.get(n).get(i);
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
	static void bfs(int n) {
		qu = new LinkedList<>();
		qu.add(n);
		visited[n] = true;
		
		while(!qu.isEmpty()) {
			int x = qu.poll();
			for(int i=0; i<arr.get(x).size(); i++) {
				int y = arr.get(x).get(i);
				if(!visited[y]) {
					visited[y] = true;
					qu.add(y);
				}
			}
		}
	}
	static void printGraphToAdjList() {
		for(int i=1; i<arr.size(); i++) {
			System.out.println("정점 " + i + "의 인접리스트	");
			for(int j=0; j<arr.get(i).size(); j++) {
				System.out.print(" -> " + arr.get(i).get(j));
			}
			System.out.println();
		}
	}
}
