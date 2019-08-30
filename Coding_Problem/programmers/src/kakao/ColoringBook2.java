package kakao;

public class ColoringBook2 {
	public static void main(String[] args) {
		SolutionColoringBook2 su = new SolutionColoringBook2();
		int m = 6;
		int n = 4;
		int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 3 },
				{ 0, 0, 0, 3 } }; // [4, 5]
		for (int data : su.solution(m, n, picture))
			System.out.println(data);
	}
}

class SolutionColoringBook2 {
	static int[][] color;
	static boolean[][] check;
	public int[] solution(int m, int n, int[][] picture) {
		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		color = picture;
		check = new boolean[m][n];
		
		
		
		int[] answer = new int[2];
		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;
		return answer;
	}

	public static int checkArea(int val, int i, int j, int m, int n) {
		
		return 1;
	}
}