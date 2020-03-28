package codingtest.kakao;

import java.util.Stack;

public class Problem1_2020 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};		// result : 4
		System.out.println("result : " + solution(board, moves));
	}
	public static int solution(int[][] board, int[] moves) {
        int answer = 0, value;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves) {
        	for(int i=0; i<board.length; i++) {
        		value = board[i][move-1];
        		if(value != 0) {
        			if(!stack.isEmpty() && value == stack.peek()) {
        				stack.pop();
        				answer += 2;
        			} else {
        				stack.add(value);
        			}
        			board[i][move-1] = 0;
        			break;
        		}
        	}
        }
        System.out.println(stack);
        return answer;
    }
}