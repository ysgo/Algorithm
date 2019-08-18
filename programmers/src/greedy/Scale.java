package greedy;

import java.util.Arrays;

public class Scale {
	public static void main(String[] args) {
		SolutionScale su = new SolutionScale();
		int[] weight = {3, 1, 6, 2, 7, 30, 1};	// 21
		System.out.println(su.solution(weight));
	}
}
class SolutionScale {
    public int solution(int[] weight) {
        int answer = 0;
        Arrays.sort(weight);
        for(int data : weight)
        	System.out.println(data);
        // 누적 값을 만들기 위한 배열
        int[] sum = new int[weight.length];
        int tmp = 0;
        for(int i=0; i<weight.length; i++) {
        	tmp += weight[i];
        	sum[i] = tmp;
        	if(i < weight.length-1 && sum[i]+1 < weight[i+1]) {	// i의 범위가 weight길이-1이 안되면 런타임 에러가 뜸
        		answer = sum[i]+1;								// 이유는 이전 누적 값들에서 비교가 되야하는데 마지막 인덱스까지가면 비교 인덱스가 초과됨
        		break;
        	}
        	// 마지막 범위까지 비교했다면 마지막 값의 바로 다음값이 그다음 만들수 있는 최소값이 됨
        	if(i == weight.length-1) {
        		answer = sum[i]+1;
        	}
        }
        return answer;
        /* 비슷하지만 짧게 구현한 코드
         * int e = 0;
        	Arrays.sort(weight);

	        for(int i=0; i<weight.length; i++){
	            int num = weight[i];
	            if(e+1 < num){
	                return e+1;
	            }else{
	                e = e+num;
	            }
	        }
	        return e+1;
         */
    }
}