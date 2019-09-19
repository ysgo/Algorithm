package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TwoFiveEightThree_BFS {
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int[][] paper;
	static boolean[][] visited;
	static int M;
	static int N;
	static int K;
	static int divide = 0;
	static Queue<Paper> qu = new LinkedList<>();
	static LinkedList<Integer> area = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		paper = new int[101][101];
		visited = new boolean[101][101];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int l_x = Integer.parseInt(st.nextToken());
			int l_y = Integer.parseInt(st.nextToken());
			int r_x = Integer.parseInt(st.nextToken());
			int r_y = Integer.parseInt(st.nextToken());

			for (int m = l_x; m < r_x; m++) {
				for (int n = l_y; n < r_y; n++) {
					paper[n][m] = 1;
				}
			}
		}
		printMap();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (paper[i][j] == 0 && !visited[i][j]) {
					divide++;
					bfs(i, j);
				}
			}
		}
		System.out.println(divide);

		Collections.sort(area);
		for (int i = 0; i < area.size(); i++) {
			if(i == area.size()-1)
				System.out.print(area.get(i));
			else
				System.out.print(area.get(i) + " ");
		}
	}

	static void bfs(int x, int y) {
		visited[x][y] = true;
		qu.add(new Paper(x, y));
		int count = 0;
		while (!qu.isEmpty()) {
			Paper tmp = qu.poll();
			count++;
			for (int i = 0; i < 4; i++) {
				int xx = tmp.x + dx[i];
				int yy = tmp.y + dy[i];
				if (xx >= 0 && xx < M && yy >= 0 && yy < N && paper[xx][yy] == 0 && !visited[xx][yy]) {
					visited[xx][yy] = true;
					qu.add(new Paper(xx, yy));
				}
			}
		}
		area.add(count);
	}
	public static void printMap() {
		for(int i = 0 ; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(paper[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Paper {
	int x;
	int y;

	Paper(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
