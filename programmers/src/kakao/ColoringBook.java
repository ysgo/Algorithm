package kakao;

public class ColoringBook {
	public static void main(String[] args) {
		SolutionColoringBook su = new SolutionColoringBook();
		int m = 6;
		int n = 4;
		int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
				{ 0, 0, 0, 3 } }; // [4, 5]
		for (int data : su.solution(m, n, picture))
			System.out.println(data);
	}
}

class SolutionColoringBook {
	static int[][] color;
	static boolean[][] chkColor;
	public int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		color = picture;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// 그림 그려진 경우에 영역의 칸수 증가
				if (color[i][j] != 0) {
					int tmp = check(picture[i][j], i, j, m, n);
					maxSizeOfOneArea = Math.max(tmp, maxSizeOfOneArea);
					numberOfArea++;
				}
			}
		}

		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public static int check(int val, int i, int j, int m, int n) {
		// 상하좌우 체크하기
		if (i >= m || j >= n || i < 0 || j < 0 || val != color[i][j]) {
			return 0;
		}
		color[i][j] = 0;
		int count = 1;
		
		count += check(val, i-1, j, m, n);	// 위쪽
		count += check(val, i, j-1, m, n);	// 왼쪽
		count += check(val, i+1, j, m, n);	// 아래쪽
		count += check(val, i, j+1, m, n);	// 오른쪽
		
		return count;
	}
}