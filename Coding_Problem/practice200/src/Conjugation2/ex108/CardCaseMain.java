package Conjugation2.ex108;
//���ٸ� �̿��Ͽ� ī�� �����ϱ�
public class CardCaseMain {

	public static void main(String[] args) {
		CardCase cc = new CardCase();
		cc.make();
		cc.print();
		System.out.println("-----------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("-----------------------------");
		cc.shuffle();
		cc.print();
		System.out.println("-----------------------------");
		cc.sort();
		cc.print();
		System.out.println("-----------------------------");
		cc.rsort();
		cc.print();
		System.out.println("-----------------------------");
		cc.lambdasort();
		cc.print();
		System.out.println("-----------------------------");
		cc.lambdarsort();
		cc.print();
	}

}
