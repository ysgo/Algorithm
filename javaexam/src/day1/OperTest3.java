package day1;

public class OperTest3 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10) + 1; // 1~10
		char result = num%2 == 1?'Ȧ':'¦';
		System.out.println(num + "�� " + result + "���Դϴ�.");
		
		System.out.println(num + "�� " + (num%2 == 1?'Ȧ':'¦') + "���Դϴ�.");
	}
}
