package search;
// 자연 정렬 = 자연스러운 정렬을 하려면 다음과 같은 방법으로 클래스를 정의
public class A implements Comparable<A> {
	
	// 필드, 메서드 등
	
	@Override
	public int compareTo(A o) {
		// this가 o보다 크면 양의 값 반환
		// this가 o보다 작으면 음의 값 반환
		// this가 o와 같으면 0 반환
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		// this가 obj와 같으면 true 반환
		// this가 obj와 같지 않으면 false 반환
		return super.equals(obj);
	}
}
