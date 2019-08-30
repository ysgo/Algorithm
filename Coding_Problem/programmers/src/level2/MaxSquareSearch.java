package level2;

public class MaxSquareSearch {
	public static void main(String[] args) {
		SolutionMaxSquareSearch su = new SolutionMaxSquareSearch();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};	//9
//		int[][] board = {{0,0,1,1},{1,1,1,1}};	//4
		System.out.println("결과값 : " + su.solution(board));
	}
}

class SolutionMaxSquareSearch {
	public int solution(int[][] board) {
		int answer = 1234;
		int[][] copy = new int[board.length+1][board[0].length+1];
		
		

		return answer;
	}
}