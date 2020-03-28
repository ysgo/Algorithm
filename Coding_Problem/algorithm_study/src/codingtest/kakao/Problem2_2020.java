package codingtest.kakao;

public class Problem2_2020 {
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";	// [2, 1, 3, 4]
		String s1 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";	// [2, 1, 3, 4]
		String s2 = "{{20,111},{111}}";				// [111, 20]
		String s3 = "{{123}}"; 						// [123]
		String s4 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";	// [3, 2, 4, 1]
		System.out.println("result : " + solution(s));
		System.out.println("result1 : " + solution(s1));
		System.out.println("result2 : " + solution(s2));
		System.out.println("result3 : " + solution(s3));
		System.out.println("result4 : " + solution(s4));
	}
    public static int[] solution(String s) {

    	int[] answer = {};
        String str = s.substring(1, s.length()-1);
        System.out.println(str);
        char[] charArray = s.toCharArray();
        char tmp = ' ';
        for(char item : charArray) {
        	if(tmp == '}') {
        		
        	} else if(tmp == '{' ||  item > 47 && item < 58) {
        	}
        	tmp = item;
        }
        return answer;
    }
}