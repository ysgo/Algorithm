package hard.ifcase;

public class Problem123 {
	public static void main(String[] args) {
		int num = 53;
		System.out.println(num);
		if(num <= 60) {
			if(num <= 30) {
				num += --num / 2 - 30;
			}
			else {
				num -= --num / 2 + 30;
				System.out.println(num);
			}
			num += ++num;
		}
		System.out.println(num);
	}
}