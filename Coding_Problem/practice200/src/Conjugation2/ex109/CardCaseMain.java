package Conjugation2.ex109;
//���ٿ� ::(Double Colon)�� �̿��Ͽ� ī�� �����ϱ�
public class CardCaseMain {

	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make();
		cc.print();
		System.out.println("------------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("------------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("------------------------------");
		cc.sort();
		cc.print();
		cc.rsort();
		System.out.println("------------------------------");
		cc.lambdasort2();
		cc.print();
		System.out.println("------------------------------");
		cc.lambdarsort3();
		cc.print();
	}

}
