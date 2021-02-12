package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다.
 * 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
 * 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때,
이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
입출력 예
citations			return
[3, 0, 6, 1, 5]		3 		*/
public class HIndex {
	public static void main(String[] args) {
		SolutionHIndex su = new SolutionHIndex();
//		int[] citations = {3, 0, 6, 1, 5};	 // return 3
//		int[] citations = {51, 22, 20 ,14, 10, 4, 3};	 // return 5
		int[] citations = {0,0,0,0};	 // return 5
//		int[] citations = {22, 47, 32, 28, 10, 9, 8, 42, 15, 17, 24};	 // return 10
		System.out.println(su.solution(citations));
	}
}
class SolutionHIndex{
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<citations.length; i++) {
        	arr.add(citations[i]);
        }
        for(int i=0; i<citations.length; i++)
        	arr2.add(i+1);
        Collections.sort(arr);
        Collections.reverse(arr);
//        for(int data : arr)
//        	System.out.print(data +" ");
//        System.out.println();
//        for(int data : arr2)
//        	System.out.print(data +" ");
        for(int i=0; i<arr.size(); i++) {
        		if(arr.get(i) == arr2.get(i)) {		// 피인용수가 순위와 같아질때 
        			answer = arr2.get(i);		
        			break;
        		}
        		else if(arr.get(i) < arr2.get(i)) {	// 피인용수가 순위보다 작아지기 시작하는 순간 조건 
        			answer = arr2.get(i)-1;			// 0, 0 일때의 해결법 필요 
        			return answer;					// 0만 있을경우 첫번째에서 조건을 만족하여 0이 리턴(곧바로 반환)
        		}         							// 그렇지 않으면 인용수 배열의 길이를 리턴하게 됨(마지막 오류 해결)
        	}
        if(answer == 0)
        	answer = arr2.size();
        return answer;
        
        //1.  유사하지만 간결한 풀이
        /*int answer = 0;
		Arrays.sort(citations);
		int temp = 0;
		for (int i = 0; i < citations.length; i++) {
			int smaller = Math.min(citations[i], citations.length - i);
			answer = Math.max(answer, smaller);
		}
		return answer;
		2. 인덱스 최고값부터
		Arrays.sort(citations);
        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length - i);
            if(max < min) max = min;
        }
        return max;
		3. TreeMap을 이용한 풀이 
		Map<Integer, Integer> map = new TreeMap<>();
        int answer = 0;
        for(int n : citations){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        int count = citations.length;
        for(int i=0; i<=10000;i++){
            if(count >= i){
                answer = i;
                if(map.containsKey(i))
                    count -= map.get(i);
            }
            else{
                break;
            }
        }
        return answer;	*/
    }
}
