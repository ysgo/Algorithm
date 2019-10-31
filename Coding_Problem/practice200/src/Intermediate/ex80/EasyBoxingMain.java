package Intermediate.ex80;

import java.util.ArrayList;

//박싱, 언박싱으로 기본 타입을 참조 타입으로 변환하기
public class EasyBoxingMain {

	public static void main(String[] args) {
		int intNm1 = 123;
		long longNum1 = 345L;
		double doubleNum = 123.123;
		Integer intWrap1 = intNm1;
		Long longWrap1 = longNum1;
		Double doubleWrap1 = doubleNum;
		double dd = doubleWrap1;
		Integer intWrap2 = intNm1;
		intNm1 = intWrap2;
		System.out.println(intNm1);
		
		ArrayList<Integer> ilists = new ArrayList<>();
		ilists.add(new Integer(3));
		ilists.add(5);
		int a = ilists.get(0);
		System.out.println(a);
		
		int b = Integer.parseInt("123");
		System.out.println(b);
	}

}
