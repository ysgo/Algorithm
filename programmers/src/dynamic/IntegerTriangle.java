package dynamic;
/*
 * 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 
 * 거쳐간 숫자의 합이 가장 큰 경우를 찾아보려고 합니다.
 *  아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능합니다.
 *   예를 들어 3에서는 그 아래칸의 8 또는 1로만 이동이 가능합니다.

삼각형의 정보가 담긴 배열 triangle이 매개변수로 주어질 때, 
거쳐간 숫자의 최댓값을 return 하도록 solution 함수를 완성하세요.

제한사항
삼각형의 높이는 1 이상 500 이하입니다.
삼각형을 이루고 있는 숫자는 0 이상 9,999 이하의 정수입니다.
입출력 예
triangle													result
[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]		30	 */
public class IntegerTriangle {
	public static void main(String[] args) {
		SolutionIntegerTriangle su = new SolutionIntegerTriangle();
		int[][] triangle = { {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5} };
		System.out.println(su.solution(triangle));
	}
}
class SolutionIntegerTriangle {
    public int solution(int[][] triangle) {
//        dp(triangle, 0, 0, triangle[0][0]);											// 합의 시작은 7부터다
    	int answer=0;
    	for(int i=1; i<triangle.length; i++) {
    		for(int j=0; j<i; j++) {
    			if(j==0) {
    				triangle[i][j] += triangle[i-1][j];									// 왼쪽 가장자리 기준 
    			} else if(i==j) {
    				triangle[i][j] += triangle[i-1][j-1];								// 오른쪽 가장자리 기준 
    			} else {
    				triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);	// 중간 기준(두개 중 하나 선택) 
    			}
//    			if(answer < triangle[i][j])
//    				answer = triangle[i][j];
    		}
    	}
    	for(int i=0; i<triangle.length; i++) {
    		answer = Math.max(triangle[triangle.length-1][i], answer);					// 바닥깊이에서의 최대값 구하기 
    	}
    	
        return answer;
    }
    
    
//	시간 초과 발
//    static void dp(int[][] triangle, int dep, int j, int sum) {		// 2차원배열 i,j 인덱스와 합을 매개변수로 정해준다 
//    	if(dep == triangle.length-1) {								// 깊이가 바닥 인덱스값에 이르면 종료해야한다 
//    		if(answer < sum) {										// 결과보다 큰 합이 있다면 큰 값으로 저장한다 
//    			answer = sum;
//    		}
//    		return;
//    	}
//    	dp(triangle, dep+1, j, sum + triangle[dep+1][j]);			// j가 같은 배열위치의 값들의 합을 구한다(좌측) 
//    	dp(triangle, dep+1, j+1, sum + triangle[dep+1][j+1]);		// j값의 우측값과의 합을 구한다 
//    }
}
