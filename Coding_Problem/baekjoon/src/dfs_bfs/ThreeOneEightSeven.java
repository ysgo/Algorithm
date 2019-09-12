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
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = br.readLine().split(" ");
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
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(a, b));
		visited[a][b] = true;
		int v = 0;
		int k = 0;
		while(!q.isEmpty()) {
//			Node cur = q.poll();
			int x = q.peek().x;
			int y = q.peek().y;
			
			if(arr[x][y] == 'v') v++;
			if(arr[x][y] == 'k') k++;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(isRange(nx, ny)) {
					if(arr[nx][ny] != '#' && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.add(new Node(nx, ny));
					}
				}
			}
		}
		if(k > v) {
			sheep += k;
		} else {
			wolves += v;
		}
	}
	static boolean isRange(int x, int y) {
		if(x >= 0 && y >= 0 && x < R && y < C) return true;
		return false;
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
