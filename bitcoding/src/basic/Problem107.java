package basic;

public class Problem107 {
	public static void main(String[] args) {
		int A = 1; int B = 3; int C = 5; int D = 7;
		
		System.out.println(A - 2 * A);	// -1
		System.out.println(A + B % C);	// 4
		System.out.println(++A * A - D);	// -3
		System.out.println((B++) - ++B);	// -2
		//System.out.println(++(B + C) - B);	// error
		System.out.println(--B - B + (++B));	// 5 윗 줄의 각 변수의 증감연산자가 이어서 연산되는 것이 중
		System.out.println((A++) + ++A * ++A);	// 22 A 또한 마찬가지. main 안에서 변수가 변동되는 중임.
	}
}
