package search;
/* 제네릭 클래스 예제 클래스
 제네릭 = 처리해야할 대상의 자료형에 의존하지 않는 클래스(인터페이스) 구현 방식을 말함
 장점  1.자료형에 의존하지 않아 범용으로 사용 가능
 	2.Java에서 지원하는 기능이므로 안전한 방법으로 사용가능
 사용법  = 클래스 이름 바로 뒤에 <Type> 같은 형식으로 파라미터를 붙여 선언
 	1.1개의 대문자를 사용
 	2.컬렉션(collection)의 자료형은 elemente의 앞 글자인 E를 사용
 	3.맵의 키, 값은 K와 V를 사용
 	4.일반적으로 T를 사용
*/
public class GenericClassTester {
	// 제네릭 클래스의 파라미터를 T라고 작성
	static class GenericClass<T> {
		private T xyz;
		GenericClass(T t) {	// 생성자
			this.xyz = t;
		}
		T getXyz() {		// xyz를 반환
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		// 다음과 같이 파라미터에 String을 넘길 수 있고 Integer를 넘길 수 있음
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
	}
}
