package recursive;
// 메서드의 끝에서 실행하는 꼬리 재귀를 쉽게 제거할 수 있다.
// 해석 = n의 값을 n - 2로 업데이트하고 메서드의 시작 지점으로 돌아간다.

public class RecurX1 {
	static void recur(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
}
