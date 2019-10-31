package Conjugation2.ex111;
//리스트에 서로 다른 카드 20개 저장하기
public class CardCaseMain {

	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make();
		cc.print();
		System.out.println("------------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("-------------------------------");
		cc.shuffle();
		cc.print();
	}

}
