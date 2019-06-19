package stack_queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
/*
 * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

제한사항
prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
prices의 길이는 2 이상 100,000 이하입니다.
입출력 예
prices				return
[1, 2, 3, 2, 3] 	[4, 3, 1, 1, 0]	*/
public class StockPrice {
	public static void main(String[] args) {
		SolutionStockPrice su = new SolutionStockPrice();
		int[] prices = {1, 2, 3, 2 ,3};
		for(int data : su.solution(prices)) {
			System.out.println(data);
		}
	}
}
class SolutionStockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        int tmp=0;
        int count=0;
        for(int data : prices) {		// 큐에 값을 모두 삽입
        	q.add(data);
        }
        for(int i=0; i<prices.length; i++) {
        	tmp = q.remove();			// 비교를 위한 첫번째 값 추출
        	for(int j=i+1; j<prices.length; j++) {
        		count++;				// 1초 증가
        		if(tmp > prices[j]) {	// 추출한 값과 그 이후의 값 비교
        			break;				// 이전값이 더 크다면 반복문 종료
        		}	
        	}
        	list.add(count);			// 쓸 필요 없이 바로 int[]에 넣어도 됨
        	count=0;					// 각 초에 대한 카운트 초기화
        }					// LinkedList 효율성 : 평균 29~30ms
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
