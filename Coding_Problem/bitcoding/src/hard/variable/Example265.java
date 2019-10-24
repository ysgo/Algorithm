package hard.variable;

public class Example265 {
	public static int num = 1;
	public static void main(String[] args) {
		int num = 1;
		num += fun1(num);
		num += fun2(num);
		System.out.println(num);
	}
	public static int fun1(int num) {
		num += num;
		return num;
	}
	public static int fun2(int n) {
		n += num;
		int num = 2;
		n += num;
		return n;
	}
}
