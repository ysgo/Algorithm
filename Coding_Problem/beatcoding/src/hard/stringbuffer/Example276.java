package hard.stringbuffer;

public class Example276 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("ABCDEFGH");
		System.out.println(str);
		System.out.println(str.insert(4, "chicken"));
		System.out.println(str.reverse());
	}
}
