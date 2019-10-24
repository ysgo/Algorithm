package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
/*	8 8
	.######.
	#..k...#
	#.####.#
	#.#v.#.#
	#.#.k#k#
	#k.##..#
	#.v..v.#
	.######.	*/
public class ThreeOneEightSeven {
	static boolean[][] visited;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static char[][] arr;
	static int R;
	static int C;
	static int sheep;
	static int wolves;
	static Queue<Node> q = new LinkedList<>();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		visited = new boolean[R][C];
		arr = new char[R][C];
		for(int i=0; i<R; i++) {
			arr[i] = br.readLine().toCharArray(); 
		}
		printMap();
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(arr[i][j] != '#' && !visited[i][j]) 
					bfs(i, j);
			}
		}
		System.out.println("sheep : " + sheep + ", wolves : " + wolves);
	}
	static void bfs(int a, int b) {
		int v = 0;
		int k = 0;
		visited[a][b] = true;
		q.add(new Node(a, b));
		while(!q.isEmpty()) {
			Node cur = q.poll();
			int x = cur.x;
			int y = cur.y;
			
			if(arr[x][y] == 'v') v++;
			if(arr[x][y] == 'k') k++;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(isRange(nx, ny) && !visited[nx][ny] && arr[nx][ny] != '#') { 
					visited[nx][ny] = true;
					q.add(new Node(nx, ny));
					}
				}
			}
			if(v >= k) {
				wolves += v;
			} else {
				sheep += k;
			}
		}

	static boolean isRange(int x, int y) {
		if(x < 0 || x >= R || y<0 || y >= C) return false;
		return true;
	}
	static void printMap() {
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print((char)arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
class Node {
	int x;
	int y;
	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
