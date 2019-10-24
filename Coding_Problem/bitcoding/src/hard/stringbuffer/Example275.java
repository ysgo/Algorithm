package hard.stringbuffer;

public class Example275 {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("ABCDEFGH");
		System.out.println(str);
		System.out.println(str.append("IJKL"));
		System.out.println(str.delete(0, 4));
		System.out.println(str.deleteCharAt(4));
	}
}
