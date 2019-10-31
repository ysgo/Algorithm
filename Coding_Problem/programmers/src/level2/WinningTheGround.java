package level2;

public class WinningTheGround {
	public static void main(String[] args) {
		SolutionWinningTheGround su = new SolutionWinningTheGround();
		int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
		System.out.println("answer : " + su.solution(land));
		
		
	}
}
// 풀이법 3가지
class SolutionWinningTheGround {
	int solution(int[][] land) {
		int answer = 0;
		// DP 이용
		 int[][] dp = new int[land.length][land[0].length]; 
		for(int i = 0 ; i < 4 ; i++) {
            dp[0][i] = land[0][i];
        }
		
		for(int i=1; i<land.length; i++) {
			for(int j=0; j<land[0].length; j++) {
				for(int k=0; k<land[0].length; k++) {
					if(j == k) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + land[i][j]);
				}
			}
		}
		for(int[] datas : dp) {
			for(int data : datas)
				System.out.print(data + " ");
			System.out.println();
		}
		
		for(int i=0; i<land[0].length; i++) {
			answer = Math.max(answer, dp[dp.length-1][i]);
		}
		return answer;
	}
	int solution2(int[][] land) {
		int answer = 0;
		// DP 이용
		int[][] dp = new int[land.length][land[0].length]; 
		for(int i = 0 ; i < 4 ; i++) {
			dp[0][i] = land[0][i];
		}
		
		for(int i=1; i<land.length; i++) {
			for(int j=0; j<land[0].length; j++) {
				for(int k=0; k<land[0].length; k++) {
					if(j == k) continue;
					dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + land[i][j]);
				}
			}
		}
		for(int[] datas : dp) {
			for(int data : datas)
				System.out.print(data + " ");
			System.out.println();
		}
		
		for(int i=0; i<land[0].length; i++) {
			answer = Math.max(answer, dp[dp.length-1][i]);
		}
		return answer;
	}
	// 배열 하나만을 사용한 풀이법
	int solution3(int[][] board, int size) {
        for(int i=1; i<size; i++) {
            board[i][0] += Math.max(board[i-1][1], Math.max(board[i-1][2], board[i-1][3]));
            board[i][1] += Math.max(board[i-1][0], Math.max(board[i-1][2], board[i-1][3]));
            board[i][2] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][3]));
            board[i][3] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][2]));
        }
        return Math.max(board[size-1][0], Math.max(board[size-1][1], Math.max(board[size-1][2], board[size-1][3])));
    }
	// 재귀를 이용한 문제 해결-메소드 2개 이용
	int recur(int[][] board, int size) {
        return recur(board, size, 0, -1);
    }

    private int recur(int[][] board, int size, int y, int idx) {
      if (y >= size) return 0;
      int answer = Integer.MIN_VALUE;
      for (int i = 0; i < 4; i++) {
        if (i != idx) {
          answer = Math.max(recur(board, size, y + 1, i) + board[y][i], answer);
        }
      }
      return answer;
    }
}