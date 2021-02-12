package Beginner.ex019;

public class JavaComment {
//코멘트(주석)달기
	public static void main(String[] args) {
		/*0.0<=실수값<10.0을 (int)하면 정수만 반환한다.
		그래서 0~9 사이의 임이의 정수를 반환한다.*/
		int makeOne = (int)(Math.random()*10);
		System.out.println(makeOne);
		
	}

}
