package hard.repeat;

public class Problem150 {
	public static void main(String[] args) {
		int sum=0;
		for(int num = 2018; num>0;) {
			sum += num& 10;
			num = num & (num - 10);
		}
		System.out.println(sum);
		
		String str = "abc";
		int res = 0;
		for(int i=0; i<str.length(); i++) {
			res += str.charAt(i);
		}
		System.out.println(res);
	}
}
