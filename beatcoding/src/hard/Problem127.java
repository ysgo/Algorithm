package hard;

import java.util.Scanner;

public class Problem127 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	// Anonymous enemy
		str = str.toLowerCase();
		sc.close();
		char c = str.charAt(str.indexOf(str));
		if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
			System.out.println("Good Sentence");
		}
	
	}
}
