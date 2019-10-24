package greedy;

import java.util.ArrayList;
import java.util.List;

public class JoyStick {
	public static void main(String[] args) {
		SolutionJoyStick su = new SolutionJoyStick();
//		String name = "JEROEN"; // 56
//		String name = "JAN";	// 23
//		String name = "AABCAAAA";	// 6
		String name = "AZAAAZ"; 
		System.out.println(su.solution(name));
	}
}

class SolutionJoyStick {
	public int solution(String name) {
		// 1. 첫번째 커서가 위치한 문자를 변경('A'가 아닐경우)
		int answer = 0;
		if(answer != (name.charAt(0)-'0')) {
			answer = Math.min(name.charAt(0) - 'A', 'Z' - name.charAt(0) + 1); // 첫번째 문자 최소 횟수
		}
		// 1. 오른쪽 방향으로 이동했을떄와 왼쪽 방향으로 이동했을때 모두 계산 후 최소이동횟수 값 리턴
		List<Integer> list = new ArrayList<>();
		int val1 = 0, index1 = 0;
		int val2 = 0, index2 = 0;
		for (int i = 1; i < name.length(); i++) {
//			if(name.substring(i).matches(".*[^A]*.")) {	// 정규표현식을 사용하고자했지만 범위지정에 계속 실패함
			if(name.substring(i).contains("^[^A]*$")) {
				System.out.println(name.substring(i));
			}
				index1++;
				if(name.charAt(i) != 'A') {
					val1 += index1;
					val1 += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
					index1 = 0;
//				}				
			}
		}
		list.add(val1);
		for (int i = name.length() - 1; i > 0; i--) {
			index2++;
			if(name.charAt(i) != 'A') {
				val2 += index2;
				val2 += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
				index2 = 0;
			}
		}
		list.add(val2);
		answer += list.stream().min(Integer::compare).orElse(-1);
		return answer;
	}
}