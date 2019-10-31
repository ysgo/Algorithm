package codingtest;

public class Problem3 {
	public static void main(String[] args) {
		SolutionProblem3 su = new SolutionProblem3();
		int[][] key = {{0,0,0}, {1,0,0}, {0, 1, 1}};
		int[][] lock = {{1,1,1}, {1,1,0}, {1,0,1}};
		System.out.println("answer : " + su.solution(key, lock));
	}
}
class SolutionProblem3 {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        
        return answer;
    }
}