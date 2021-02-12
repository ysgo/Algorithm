package recursive;

import stack_queue.IntStack;

// 앞에서 호출한 재귀 메서드를 제거하기 위한 클래스
// 변수 값을 출력하기 전에 메서드가 먼저 수행되어야하기에 다음과 같은 처리가 필요
// 이런 재귀호출을 제거하려면 "변수 n의 값을 '잠시' 저장해야함"
// 데이터 구조 "스택"을 활용하여 "비재귀적"으로 구현

public class RecurX2 {
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);	// n의 값을 푸시
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) {	// 스택이 비어있지 않다면
				n = s.pop();			// 저장하고 있던 스택의 값을 팝
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
}
