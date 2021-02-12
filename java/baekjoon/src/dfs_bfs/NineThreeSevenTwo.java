package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NineThreeSevenTwo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			boolean[][] nations = new boolean[N+1][N+1];
			boolean[] visited= new boolean[N+1];
			for(int j=1; j<=M; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				nations[a][b] = nations[b][a] = true; 
			}
			
			int cnt = 0;
			for(int start=1; start<=N; start++) {
				for(int end=1; end<=N; end++) {
					if(nations[start][end] && !visited[start]) {
						visited[start] = true;
						
						Queue<Integer> qu = new LinkedList<>();
						qu.offer(start);
						while(!qu.isEmpty()) {
							int cur = qu.poll();
							for(int next=1; next<=N; next++) {
								if(nations[cur][next] && !visited[next]) {
									cnt++;
									visited[next] = true;
									qu.offer(next);
								}
							}
						}
					}
				}
			}
			sb.append(cnt).append("\n");
		}
		br.close();
		System.out.println(sb.toString());
	}
}
