package practice_problem;
import java.util.ArrayList;
/*배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 *  배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요. 
 *  단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를들면

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
입출력 예
arr				answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]		[4,3] */
class SolutionHateSameNumber {
	public int[] solution(int []arr) {
        int[] answer;						
        ArrayList<Integer> al = new ArrayList<>();	// 다음값과 비교만이 아닌, 이전값을 저장하여 비교해서 list에 저장
        for(int i=0; i<arr.length-1; i++) {
        	if(arr[i] == arr[i+1]) {
        		if(i==arr.length-2) {
        			al.add(arr[i+1]);
        		}
        	} else {
        		al.add(arr[i]);
        		if(i==arr.length-2) {
        			al.add(arr[i+1]);
        		}
        	}
        }
        answer = new int[al.size()];
        for(int i=0; i<al.size(); i++)
        	answer[i] = al.get(i);
        return answer;
	}
}
public class HateSameNumber {
	public static void main(String[] args) {
		SolutionHateSameNumber su = new SolutionHateSameNumber();
//		int[] arr = {1,1,3,3,0,1,1};	// return [1,3,0,1]
		int[] arr = {4,4,4,3,3};		// return [4,3]
		for(int data : su.solution(arr))
			System.out.println(data);
	}
}
