package Conjugation2.ex116;

import java.util.Scanner;

public class FourMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.print("4�� ��� ������ �Է��ϼ��� : ");
		int n = scann.nextInt();
		FourMagicSquare fms = new FourMagicSquare(n);
		fms.make();
		fms.print();
	}

}
