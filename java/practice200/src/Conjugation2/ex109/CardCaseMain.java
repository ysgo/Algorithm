package Conjugation2.ex109;
//람다와 ::(Double Colon)을 이용하여 카드 정렬하기
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
