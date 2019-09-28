package codingtest;

public class JobFairProblem2 {
	public static void main(String[] args) {
		SolutionJobFairProblem2 su = new SolutionJobFairProblem2();
		String[] bishops = {"D5"};				// 50
//		String[] bishops = {"D5", "E8", "G2"};	// 42
		System.out.println(su.solution(bishops));
	}
}
// 통과!
class SolutionJobFairProblem2 {
	static int[][] board;
    public int solution(String[] bishops) {
        int answer = 0;
        board = new int[8][8];
        int i=0; int j=0;
        for(String data : bishops) {
        	char[] c = data.toCharArray();
        	i = c[1] - '0' - 1;
        	j = c[0] - 'A';
        	board[i][j] = 1;
        	topRight(i-1, j+1);
        	topLeft(i-1, j-1);
        	bottmRight(i+1, j+1);
        	bottmLeft(i+1, j-1);
        }
        printMap();
        System.out.println();
        
        for(int m=0; m<board.length; m++) {
        	for(int n=0; n<board[m].length; n++) {
        		if(board[m][n] == 1 || board[m][n] == 2) {
        			continue;
        		}
        		answer++;
        	}
        }
        return answer;
    }
    static void topRight(int i, int j) {
    	if(i < 0 || i > 7 || j < 0 || j > 7) {
    		return;
    	}
    	board[i][j] = 2;
    	topRight(i-1, j+1);	// 우측 위
    }
    static void topLeft(int i, int j) {
    	if(i < 0 || i > 7 || j < 0 || j > 7) {
    		return;
    	}	
    	board[i][j] = 2;
    	topLeft(i-1, j-1);	// 좌측 위
    }
    static void bottmRight(int i, int j) {
    	if(i < 0 || i > 7 || j < 0 || j > 7) {
    		return;
    	}
    	board[i][j] = 2;
    	bottmRight(i+1, j+1);	// 우측 아래
    }
    static void bottmLeft(int i, int j) {
    	if(i < 0 || i > 7 || j < 0 || j > 7) {
    		return;
    	}
    	board[i][j] = 2;
    	bottmLeft(i+1, j-1);	// 좌측 아래
    }
    static void printMap() {
    	for(int i=0; i<board.length; i++) {
    		for(int j=0; j<board[i].length; j++) {
    			System.out.print(board[i][j]);
    		}
    		System.out.println();
    	}
    }
}
