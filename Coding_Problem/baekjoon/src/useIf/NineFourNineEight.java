package useIf;

import java.util.Scanner;

public class NineFourNineEight {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score = scn.nextInt();
		char grade=' ';
		scn.close();
		
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				grade = 'A';
			} else if(score >= 80) {
				grade = 'B';
			} else if(score >= 70) {
				grade = 'C';
			} else if(score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		System.out.println(grade);
	}
}
