package hard.dimentiontwo;
/*
Enter first : grape
Enter second : preag
same
 */
import java.util.Scanner;

public class Problem228 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("Enter first : ");
		String sen1 = stdIn.nextLine();
		System.out.print("Enter second : ");
		String sen2 = stdIn.nextLine();
		
		int[] sen1_part = new int[26];
		int[] sen2_part = new int[26];
		boolean isSame = false;
		if(sen1.length() == sen2.length()) {
			for(int i=0; i<sen1.length(); i++) {
				sen1_part[(int)sen1.charAt(i)-97]++;
				sen2_part[(int)sen2.charAt(i)-97]++;
			}
			isSame = true;
			for(int i=0; i<26; i++) {
				if(sen1_part[i] != sen2_part[i]) {
					isSame = false;
					break;
				}
			}
		}
		String result = isSame == true ? "same" : "not same";
		System.out.print(result);
		stdIn.close();
	}
}
