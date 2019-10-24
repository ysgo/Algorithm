package level2;

public class MatrixMultiple {
	public static void main(String[] args) {
		SolutionMatrixMultiple su = new SolutionMatrixMultiple();
		int[][] arr1 = {{1,4}, {3,2}, {4,1}};	// {{15, 15}, {15,15}, {15,15}}
		int[][] arr2 = {{3,3}, {3,3}};			
//		int[][] arr1 = {{2,3,2}, {4,2,4}, {3,1,4}};	// {{22,22,11}, {36,28,18},{29,20,14}}
//		int[][] arr2 = {{5,4,3}, {2,4,1}, {3,1,1}};
		int[][] answer = su.solution(arr1, arr2);
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[0].length; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class SolutionMatrixMultiple {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	int[][] answer = new int[arr1.length][arr2[0].length];
		for (int i=0; i<answer.length; i++) {
    			for(int j=0; j<answer[0].length; j++) {
    				int sum=0;
    				int k=0;
    				while(k < arr1[0].length) {
    					sum += arr1[i][k] * arr2[k][j];
    					k++;
    				}
    				answer[i][j] = sum;
    			}
    		}
    	return answer;
    }
}