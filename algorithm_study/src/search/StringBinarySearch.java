package search;

import java.util.Arrays;
import java.util.Scanner;

// 자연 정렬로 정렬된 배열에서 검색하기 실습
// 문자열의 배열(Java의 키워드)에서 검색

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// Java에서 사용하는 키워드(우선은 몇 개만 추려서 입력함)
		String[] x = {"abstract", "assert", "boolean", "break", "byte"};
		
		System.out.print("원하는 키워드를 입력하세요 : ");	// 키 값을 입력
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);	// 배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println("해당 키워드는  x[" + idx + "]에 있습니다.");
		stdIn.close();
	}
}
