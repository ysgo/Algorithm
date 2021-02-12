package Intermediate.ex31;
//상수의 묶음 클래스 enum 사용하기
public class FruitMain {

	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());
		System.out.println(pear2.ordinal());
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}

}
