package hard.recursive;
/* Enter the number : 5
5 남았습니다.
4 남았습니다.
3 남았습니다.
2 남았습니다.
1 남았습니다.
- 끝 - */
import java.util.Scanner;

public class Problem241 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = stdIn.nextInt();
		countdown(num);
		stdIn.close();
	}
	public static int countdown(int num) {
		if(num == 0) {
			System.out.println("- 끝 -");
			return 0;
		}
		System.out.println(num-- + " 남았습니다.");
		return countdown(num);
	}
}
