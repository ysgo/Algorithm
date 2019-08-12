package level2;

public class FibonacciNumber {
	public static void main(String[] args) {
		SolutionFibonacciNumber su = new SolutionFibonacciNumber();
//		int n = 3;	// 2;
		int n = 5;	// 5;
		System.out.println(su.solution(n));
	}
}

class SolutionFibonacciNumber {
	public int solution(int n) {
		int[] fibo = new int[n+1];
		fibo[0] = 0; fibo[1] = 1;
		for(int i=2; i<n+1; i++) {
			fibo[i] = fibo[i-1]%1234567 + fibo[i-2]%1234567;
		}
		return fibo[n] % 1234567;
		
//		재귀 이용
//		long answer = 0;
//      F(n) = F(n-1) + F(n-2) 
//        if(num==1||num==2){
//            return 1;
//        }else{
//            long fn_1 = fibonacci(num-1);
//            long fn_2 = fibonacci(num-2);
//            answer = fn_2+fn_1;
//        }
//        return answer;
	}
}