package dfs_bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneZeroZeroTwoSix {
	static boolean[][] check;
	static char[][] loc;
	// 상하좌우 이동위한 배열
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		loc = new char[num][num];
		check = new boolean[num][num];
		for(int i=0; i<num; i++) {
			loc[i] = br.readLine().toCharArray();
		}
		int answer1 = 0;
		int answer2 = 0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(check[i][j] == false) {
					answer1++;
					dfs(i, j, num);
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(loc[i][j] == 'G') {
					loc[i][j] = 'R';
				}
			}
		}
		check  = new boolean[num][num];
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(check[i][j] == false) {
					answer2++;
					dfs(i, j, num);
				}
			}
		}
		System.out.println(answer1 + " " + answer2);
	}
	static void dfs(int i, int j, int num) {
		check[i][j] = true;
		
		char c = loc[i][j];
		for(int x=0; x<4; x++) {
			int nx = i + dx[x];
			int ny = j + dy[x];
			
			if(nx >= 0 && nx < num && ny >= 0 && ny < num && !check[nx][ny]) {
				if(loc[nx][ny] == c) {
					dfs(nx, ny, num);
				}
			}
		}
	}
}