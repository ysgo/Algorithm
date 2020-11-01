package level2;

public class RightParentheses {
	public static void main(String[] args) {
		SolutionRightParentheses su = new SolutionRightParentheses();
		String s = "()()";
//		String s = "(())()";
//		String s = ")()(";
//		String s = "(()(";
		System.out.println(su.solution(s));
	}
}
class SolutionRightParentheses {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0, j=-1; i<len; i++) {
        	if(s.charAt(i) == '(') {
        		sb.append(s.charAt(i));
        		j++;
        	} else {
        		if(sb.length() != 0) {
        			sb.deleteCharAt(j);
        			j--;
        		} else {
        			sb.append(s.charAt(i));
        			j++;
        		}
        	}
        }
        if(sb.length() != 0) {
        	answer = false;
        }
        return answer;
        /* 비슷하면서 일반 배열과 문자열만 사용
         * boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }
        return answer;         */
    }
}