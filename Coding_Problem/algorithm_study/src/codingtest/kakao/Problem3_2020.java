package codingtest.kakao;

public class Problem3_2020 {
	public static void main(String[] args) {
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"fr*d*", "abc1**"};						// 2
//		String[] banned_id1 = {"*rodo", "*rodo", "******"};				// 2
//		String[] banned_id2 = {"fr*d*", "*rodo", "******", "******"};	// 3
		System.out.println("result1 : " + solution(user_id, banned_id));
//		System.out.println("result2 : " + solution(user_id, banned_id1));
//		System.out.println("result3 : " + solution(user_id, banned_id2));
	}
    public static int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        return answer;
    }
}
