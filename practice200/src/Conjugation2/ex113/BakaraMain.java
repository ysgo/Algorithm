package Conjugation2.ex113;

import java.util.Scanner;

//ī�����(��ī��) �����
public class BakaraMain {

	public static void main(String[] args) {
		System.out.println("�ڻ��� �Է��Ͻÿ�");
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		int i = 0;
		Bakara bakara = new Bakara();
		while(true) {
			bakara.start();
			i++;
			System.out.println(i + "��° ����Դϴ�.");
			System.out.println("����� ���� �ڻ��� �� " + sum + "���Դϴ�.");
			System.out.println("����� ������ �ݾ��� �����ϼ���.");
			
			int n = in.nextInt();
			if(n > sum) {
				System.out.println("�ڻ��� �Ѿ �� �����ϴ�. �ٽ� �Է��ϼ���.");
				i--;
			} else {
				sum = sum - n;
				System.out.println("����� " + n + "��ŭ�� �ݾ��� �����߽��ϴ�.");
				System.out.println("����� �ڻ��� " + sum + "���Դϴ�.");
				System.out.println("�� �ݾ��� ��� �Žðڽ��ϱ�");
				System.out.println("1 : Player");
				System.out.println("2 : Dealer");
				System.out.println("3 : Tie(���º�)");
				
				int nn = in.nextInt();
				switch(nn) {
					case 1 : System.out.println("����� Player�� �ɾ����ϴ�.");
						break;
					case 2 : System.out.println("����� Dealer�� �ɾ����ϴ�.");
						break;
					case 3 : System.out.println("����� Tie�� �ɾ����ϴ�.");
						break;
				}
				System.out.println();
				System.out.println("-----------------------");
				System.out.println("----<Game Start!>----");
				System.out.println("-----------------------");
				
				bakara.result();
				
				System.out.println("-----------------------");
				System.out.println("----<���� ���!>----");
				System.out.println("-----------------------");
				
				if(nn == bakara.getWhoWin()) {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("�����մϴ�!");
					sum = sum + (n * 2);
				}
				else if(nn == bakara.getWhoWin()) {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("�����մϴ�!");
					sum = sum + (n * 2);
				}
				else if(nn == bakara.getWhoWin()) {
					System.out.println("����� �̰���ϴ�.");
					System.out.println("�����մϴ�!");
					sum = sum + (n * 8);
				}
				else {
					System.out.println("�ȵƱ���... �����Դϴ�.");
				}
				
				System.out.println("����� ���� �ڻ��� " + sum + "���Դϴ�.");
				System.out.println();
				System.out.println("----------------------------");
				
				if(sum <= 0) {
					System.out.println("�ڻ��� �����մϴ�. �����ϼ̽��ϴ�.");
					break;
				}
			}
		}
	}

}
