package Conjugation2.ex111;
//����Ʈ�� ���� �ٸ� ī�� 20�� �����ϱ�
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
