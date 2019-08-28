package level2;

public class JadenCaseString {
	public static void main(String[] args) {
		SolutionJadenCaseString su = new SolutionJadenCaseString();
//		String s = "3people unFollowed me"; // 3people Unfollowed Me
		String s = "for the last week"; // For The Last Week
//		String s = "3people unFollowed me ASfsdf adfasdfA123 123123aASFFGGG 1 asdfasdf";		// For The Last Week
//		String s = "1231444 123123";		// For The Last Week
		System.out.println(su.solution(s));
	}
}

class SolutionJadenCaseString {
	public String solution(String s) {
		String answer = "";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (j == 0) {
					answer += Character.toString(words[i].charAt(j)).toUpperCase();
				} else {
					answer += Character.toString(words[i].charAt(j)).toLowerCase();
				}
			}
			if (i != words.length - 1) {
				answer += " ";
			}
		}
		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			answer += " ";
		}
		return answer;
	}
}