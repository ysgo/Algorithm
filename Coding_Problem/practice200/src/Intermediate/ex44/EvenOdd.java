package Intermediate.ex44;
//do~while을 이용하여 1이 될 때까지 나누고 곱하기
public class EvenOdd {
	public static void showOddEven(int n) {
		int temp = n;
		do {
			if(temp % 2 == 1) {
				temp = temp * 3 + 1;
			} else { 
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		} while(temp != 1);
		System.out.println("\n-------------------------------------------");
	}
	
	public static void main(String[] args) {
		showOddEven(122);
	}

}
