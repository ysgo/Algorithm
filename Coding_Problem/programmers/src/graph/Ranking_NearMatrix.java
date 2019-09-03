package graph;

import java.util.LinkedList;

public class Ranking_NearMatrix {
	public static void main(String[] args) {
		SolutioRanking_NearArray su = new SolutioRanking_NearArray();
		int n = 5;
		int[][] results = { { 4, 3 }, { 4, 2 }, { 3, 2 }, { 1, 2 }, { 2, 5 } }; // 2
		System.out.println(su.solution(n, results));
	}
}
// 인접행렬로 graph 해결
class SolutioRanking_NearArray {
	public int solution(int n, int[][] results) {
		int answer = n;
		boolean[][] graph = new boolean[n][n];
		LinkedList<Integer> win = new LinkedList<Integer>();
		// 인접행렬 생성
		for (int i = 0; i < n; i++) {
			graph[i][i] = true;
		}
		for (int i = 0; i < results.length; i++) {
			graph[results[i][0] - 1][results[i][1] - 1] = true;
		}

		// win 탐색
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (graph[i][j] == true) {
					win.add(i);
				}
			}
			if (!win.isEmpty()) {
				for (int k = 0; k < n; k++) {
					if (graph[j][k] == true) {
						for (int l = 0; l < win.size(); l++) {
							int p = win.get(l);
							graph[p][k] = true;
						}
					}
				}
				win.clear();
			}
		}

		// 순위를 매길 수 있는 선수의 수
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!graph[i][j] && !graph[j][i]) {
					answer--;
					break;
				}
			}
		}
		return answer;
	}
}