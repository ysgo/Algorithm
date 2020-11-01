package basic;

public class Problem {
	public static void main(String[] args) {
		wordlist("72451");
	}
	public static void wordlist(String str) {
		char[] c = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			c[i] = str.charAt(str.length()-i-1);
			System.out.print(c[i]);
		}
	}
}
