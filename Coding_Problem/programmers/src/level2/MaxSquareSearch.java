package level2;

public class MaxSquareSearch {
	public static void main(String[] args) {
		SolutionMaxSquareSearch su = new SolutionMaxSquareSearch();
//		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};	//9
		int[][] board = {{0,0,1,1},{1,1,1,1}};	//4
		System.out.println("결과값 : " + su.solution(board));
	}
}

class SolutionMaxSquareSearch {
	public int solution(int[][] board) {
		int answer = 0;
		int[][] copy = new int[board.length+1][board[0].length+1];
		for(int i=1; i<copy.length; i++) {
			for(int j=1; j<copy[0].length; j++) {
				if(board[i-1][j-1] == 1) {
					copy[i][j] = 1 + Math.min(Math.min(copy[i-1][j-1], copy[i-1][j]), copy[i][j-1]);
					if(answer < copy[i][j])
						answer = copy[i][j];
				}
			}
		}
		for(int[] datas : copy) {
			for(int data : datas) {
				System.out.print(data + " ");
			}
			System.out.println();
		}
		
		return answer*answer;
	}
}