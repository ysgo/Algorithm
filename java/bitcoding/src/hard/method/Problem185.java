package hard.method;
// 100000보다 작은 자연수 중 3 또는 5의 배수를 모두 더한 값을 출력하는 프로그램(코드가 20줄 이하로 작성)
public class Problem185 {
	static final int NUM = 15;
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<NUM; i++) {
			if(ismulThree(i) || ismulFive(i)) {
				sum += i;
			}
		}
		System.out.println("100000이하의 자연수 중 3 또는 5의 배수의 합 = " + sum);
	}
	static boolean ismulThree(int n) {
		return n % 3 == 0? true : false;
	}
	static boolean ismulFive(int n) {
		return n % 5 == 0? true : false;
	}
}