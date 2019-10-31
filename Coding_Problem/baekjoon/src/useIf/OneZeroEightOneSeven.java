package useIf;
import java.util.Scanner;

public class OneZeroEightOneSeven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int one = scn.nextInt();
		int two = scn.nextInt();
		int three = scn.nextInt();
		int[] num = new int[] {one, two, three};
		int second=0;
		scn.close();
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				if(num[i] > num[j]) {
					second = num[i];
					num[i] = num[j];
					num[j] = second;
				}
			}
		}
		System.out.println(num[1]);
	}

}
