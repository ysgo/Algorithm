package codingtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Line5 {
	static int[] dx = {0, 1};
	static int[] dy = {1, 0};
	static int[][] arr;
	static boolean[][] visited;
	static int n, m, x, y;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();	// 모눈종이 공간
        x = sc.nextInt();
        y = sc.nextInt();	// 도망간 좌표
        arr = new int[m+1][n+1];
        visited = new boolean[m+1][n+1];
        int time=0;
        if(x > n || x < 0 || y > m || y < 0) {
        	System.out.println("fail");
        } else {
        	loop:for(int i=0; i<n; i++) {
    			for(int j=0; j<m; j++) {
    				if(!visited[i][j] && i <= y && j <= x) {
    					time++;
    					bfs(i, j);
    				} else
    					break loop;
    			}
    		}
        }
        System.out.println(time);
        System.out.println(count);
        sc.close();
	}
	static void bfs(int i, int j) {
		if(visited[i][j] == true || i > y || j > x) return;
		visited[i][j] = true;
		Queue<Paper> qu = new LinkedList<>();
		qu.offer(new Paper(i, j));
		while(!qu.isEmpty()) {
			Paper tmp = qu.poll();
			int x = tmp.x;
			int y = tmp.y;
			for(int k=0; k<2; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
//				System.out.println(nx + " " + ny);
//				System.out.println(isRange(nx, ny));
				if(isRange(nx, ny) && !visited[nx][ny] && (nx <= y | ny <= x)) {
					visited[nx][ny] = true;
					qu.add(new Paper(nx, ny));
					System.out.println("nx : " + nx +", ny:"+ny+",x:"+x+",y:"+y);
					if(nx == y && ny == x) count++;
				}
			}
		}
	}
	static boolean isRange(int x, int y) {
		if(x < 0 || x >= m || y<0 || y >= n) return false;
		return true;
	}
	static class Paper {
		int x;
		int y;
		Paper(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
