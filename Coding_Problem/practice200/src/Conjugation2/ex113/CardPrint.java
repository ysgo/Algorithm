package Conjugation2.ex113;

public class CardPrint {
	CardCase cc = new CardCase();
	CardLaw rule = new CardLaw();
	
	private int TotalPlayer;
	private int TotalDealer;
	
	public CardPrint() { }
	
	public void make() {
		cc.make();
	}
	
	public void shuffer() {
		cc.shuffle();
	}
	
	public void print() {
		System.out.println("<�÷��̾� ī��>");
		System.out.println("--------------------");
		System.out.print("1��° ī�� : ");
		System.out.println(cc.getCards().get(0));
		System.out.print("1��° ī�� �� : ");
		System.out.println(num(0));
		
		System.out.print("2��° ī�� : ");
		System.out.println(cc.getCards().get(1));
		System.out.print("2��° ī�� �� : ");
		System.out.println(num(1));
		
		System.out.print("�÷��̾��� 2���� ī���� : ");
		System.out.println(sumP());
		TotalPlayer = sumP();
		
		System.out.println("-----------------------------");
		
		if(rule.natural(sumP(), sumD())) {
			System.out.println("���� ó���� �ٷ� �ܷ�ϴ�!");
			TotalPlayer = sumP();
		} else if(rule.stand(sumP(), sumD())) {
			standPrintPl();
		} else if(rule.thirdCardPlayer(sumP())) {
			System.out.println("3��° ī�带 �޽��ϴ�!");
			System.out.println("3��° ī�� : " + cc.getCards().get(4));
			System.out.println("3��° ī�� �� : " + num(4));
			System.out.println("----------------------------------------");
			System.out.println("�÷��̾��� �� ī���� : " + total(sumP(), num(4)));
			TotalPlayer = total(sumP(), num(4));
		}
		System.out.println("-------------------------");
		System.out.println();
		
		System.out.println("<��Ŀ ī��>");
		System.out.println("-------------------------");
		
		System.out.print("1��° ī�� : ");
		System.out.println(cc.getCards().get(2));
		System.out.print("1��° ī�� �� : ");
		System.out.println(num(2));
		
		System.out.print("2��° ī�� : ");
		System.out.println(cc.getCards().get(3));
		System.out.print("2��° ī�� �� : ");
		System.out.println(num(3));
		
		System.out.print("��Ŀ�� 2���� ī���� : ");
		System.out.println(sumD());
		TotalDealer = sumD();
		
		System.out.println("-------------------------");
		
		if(rule.natural(sumP(), sumD())) {
			System.out.println("���� ó���� �ٷ� �ܷ�ϴ�!");
			TotalDealer = sumD();
		} else if(rule.stand(sumP(), sumD())) {
			standPrintDl();
		} else if(rule.thirdCardDealer(sumD(), num(4))) {
			System.out.println("3��° ī�带 �޽��ϴ�!");
			System.out.println("3��° ī�� : " + cc.getCards().get(5));
			System.out.println("3��° ī�� �� : " + num(5));
			System.out.println("----------------------------");
			System.out.println("��Ŀ�� �� ī���� : " + total(sumD(), num(5)));
			TotalDealer = total(sumD(), num(5));
		}
		System.out.println("----------------------------");
		System.out.println();
	}
	
	public void standPrintPl() {
		System.out.println("���ĵ��Դϴ�.");
		if(sumP()>5 && sumP()<8) {
			if(sumD() < 6) {
				System.out.println("��Ŀ�� 3��° ī�带 �޽��ϴ�.");
			} else {
				System.out.println("�ٷ� �ܷ�ϴ�!");
				TotalPlayer = sumP();
			}
		} else if(sumD() == 7) {
			if(sumP() < 6) {
				System.out.println("3��° ī�带 �޽��ϴ�!");
				System.out.println("3��° ī�� : " + cc.getCards().get(4));
				System.out.println("3��° ī�� �� : " + num(4));
				System.out.println("--------------------------");
				System.out.println("�÷��̾��� �� ī���� : " + total(sumP(), num(4)));
				TotalPlayer = total(sumP(), num(4));
			} else {
				System.out.println("�ٷ� �ܷ�ϴ�!");
				TotalPlayer = sumP();
			}
		}
	}
	
	public void standPrintDl() {
		System.out.println("���ĵ��Դϴ�.");
		if(sumP()>5 && sumP()<8) {
			if(sumD() < 6) {
				System.out.println("3��° ī�带 �޽��ϴ�.");
				System.out.println("'3��° ī�� : " + cc.getCards().get(5));
				System.out.println("3��° ī�� ��: " + num(5));
				System.out.println("------------------------------------");
				System.out.println("��Ŀ�� �� ī���� : " + total(sumD(), num(5)));
				TotalDealer = total(sumD(), num(5));
			} else {
				System.out.println("�ٷ� �ܷ�ϴ�!");
				TotalDealer = sumD();
			}
		} else if(sumD() == 7) {
			if(sumP() <6) {
				System.out.println("�÷��̾�� 3��° ī�带 �޽��ϴ�.");
			} else {
				System.out.println("�ٷ� �ܷ�ϴ�!");
				TotalDealer = sumD();
			}
		}
	}
	
	public int num(int n) {
		int num;
		Card str = cc.getCards().get(n);
		char ch = str.getCardVal().charAt(1);
		switch(ch) {
		case 'A' : num = 1; break;
		case 'T' :
		case 'J' :
		case 'Q' :
		case 'K' : num = 0; break;
		default : num = ch - '0'; break;
		}
		return num;
	}
	
	public int sumP() {
		int sumP = 0;
		for(int i=0; i<2; i++) {
			sumP += num(i);
			if(sumP > 9) {
				sumP -= 10;
			}
		}
		return sumP;
	}
	
	public int sumD() {
		int sumD = 0;
		for(int i=2; i<4; i++) {
			sumD += num(i);
		}
		return sumD % 10;
	}
	
	public int total(int x, int y) {
		return (x+y) % 10;
	}
	
	public int returnPlayer() {
		return TotalPlayer;
	}
	
	public int returnDealer() {
		return TotalDealer;
	}
}
