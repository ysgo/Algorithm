package hard.recursive;
/*
Enter the word : assa
단어를 거꾸로 읽어도 같은 문장인지 판별 : true
 */
import java.util.Scanner;

public class Problem243 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the word : ");
		String word = stdIn.next();
		System.out.println("단어를 거꾸로 읽어도 같은 문장인지 판별 : " + is_palindrome(word));
		stdIn.close();
	}
	public static boolean is_palindrome(String word) {
		boolean check = true;
		for(int i=0; i<word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
				check = false;
			}
		}
		return check;
	}
}
