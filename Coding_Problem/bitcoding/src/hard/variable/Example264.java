package hard.variable;

public class Example264 {
	public static String str = "global variable";
	public static void main(String[] args) {
		String str = "local variable";
		System.out.println(str);
		function();
	}
	public static void function() {
		System.out.println(str);
	}
}
