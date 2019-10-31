package Conjugation2.ex105;
//equals overriding을 이용하여 카드값이 같으면 같은 객체로 만들기
public class CardMain2 {

	public static void main(String[] args) {
		Card c1 = new Card("H4");
		Card c2 = new Card("H4");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2));
	}

}
