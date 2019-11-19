package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class OneSixNineSeven {
	static int N, K;
	static int[] visited = new int[1000001];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		bfs();
	}
	static void bfs() {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(N);
		visited[N] = 1;
		while(!qu.isEmpty()) {
			N = qu.poll();
			if(N == K) {
				break;
			}
			if(N+1 <= 100000 && visited[N+1] == 0) {
				qu.add(N+1);
				visited[N+1] = visited[N] + 1;
			}
			if(N-1 >= 0 && visited[N-1] == 0) {
				qu.add(N-1);
				visited[N-1] = visited[N] + 1;
			}
			if(N*2 <= 100000 && visited[N*2] == 0) {
				qu.add(N*2);
				visited[N*2] = visited[N] + 1;
			}
		}
		System.out.println(visited[K]-1);
	}
}
