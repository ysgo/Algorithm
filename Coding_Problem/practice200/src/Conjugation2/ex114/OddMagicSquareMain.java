package Conjugation2.ex114;

import java.util.Scanner;

public class OddMagicSquareMain {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.print("Ȧ�� ������ �Է��ϼ��� : ");
		int n = scann.nextInt();
		OddMagicSquare odd = new OddMagicSquare(n);
		odd.make();
		odd.print();
	}

}
