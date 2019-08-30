package dfs_bfs;
/*n개의 음이 아닌 정수가 있습니다. 
 * 이 수를 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
 *  예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
사용할 수 있는 숫자가 담긴 배열 numbers, 타겟 넘버 target이 매개변수로 주어질 때 
숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
각 숫자는 1 이상 50 이하인 자연수입니다.
타겟 넘버는 1 이상 1000 이하인 자연수입니다.
입출력 예
numbers				target		return
[1, 1, 1, 1, 1]		3			5 */

public class TargetNumber {
	public static void main(String[] args) {
		SolutionTargetNumber su = new SolutionTargetNumber();
		int[] numbers = {1, 1, 1, 1, 1};	// 5
		int target = 3;
		System.out.println(su.solution(numbers, target));	// dfs는 깊이우선.
	}														// 행렬구조로 이해하기.(n * n 행렬)
}															// 행렬로 나올수있는 모든 경우의 수 계
class SolutionTargetNumber {								// -1 곱하기를 통해 총합이 target과 같을 때까
	static int count=0;							
    public int solution(int[] numbers, int target) {
    	int answer = dfs(numbers, target, 0);
        return answer;
    }
    static int dfs(int[] numbers, int target, int res) {
    	if(res == numbers.length) {
    		int sum=0;
    		for(int data : numbers)
    			sum += data;
    		if(sum == target)
    			count++;
    	} else {
    		dfs(numbers, target, res+1);
    		numbers[res] *= -1;
    		dfs(numbers, target, res+1);
    		numbers[res] *= -1;
    	}
    	return count;	
    }
}
