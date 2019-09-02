package basic;

public class Problem114 {
	public static void main(String[] args) {
		String str = "ABCDEFGH";
		System.out.println(str.charAt(5));
		System.out.println(str.substring(6));
		System.out.println(str.substring(0,1) + str.substring(2, 4));
		System.out.println(str.substring(0, 6));
		System.out.println(str.substring(7) + str.substring(6,7) + str.substring(5,6));
		System.out.print(str.charAt(7));
		System.out.print(str.charAt(6));
		System.out.print(str.charAt(5));
		}
}
