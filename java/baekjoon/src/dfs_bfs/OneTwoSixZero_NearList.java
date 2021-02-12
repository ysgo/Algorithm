package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

// 인접리스트를 이용한 그래프 DFS, BFS 해결
public class OneTwoSixZero_NearList {
	static int map[][];
	static boolean[] visit;
	static ArrayList<TreeMap<Integer, Integer>> arrayList;
	static int n,m,v;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		arrayList = new ArrayList<>();
		for(int i=0; i<n+1; i++) {
			Arrays.fill(map[i], 0);
			arrayList.add(new TreeMap<Integer, Integer>());
		}
		Arrays.fill(visit, false);
		for(int i=0; i<m; i++) {
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge, " ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
			arrayList.get(a).put(b, a);
			arrayList.get(b).put(a, b);
		}
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(v);
	}

	public static void dfs(int i) {
		if(visit[i] == true) return;
		visit[i] = true;
		System.out.print(i + " ");
		TreeMap<Integer, Integer> tmp = arrayList.get(i);
		for(int j : tmp.keySet()) {
			if(visit[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int i) {
		if(visit[i] == true) return;
		visit[i] = true;
		Queue<Integer> qu = new LinkedList<>();
		qu.offer(i);
		while(!qu.isEmpty()) {
			int tmp = qu.poll();
			System.out.print(tmp + " ");
			for(int j=1; j<n+1; j++) {
				if(map[tmp][j] == 1 && visit[j] == false) {
					qu.offer(j);
					visit[j] = true;
				}
			}
		}
	}
}