package array;

import java.util.Scanner;
public class FourThreeFourFour {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int sum;
		int count;
		int student=0;
		double[] result = new double[num];
		double avg;
		for(int i=0; i<num; i++) {
			count=0;
			sum=0;
			student = scn.nextInt();			
			int[] score = new int[student];
			for(int j=0; j<student; j++) {
				score[j] = scn.nextInt();
				sum += score[j];
			}
			avg = (double)sum / student;			
			for(int j=0; j<student; j++) {			
				if(score[j] > avg) {
					count++;
				}
			}
			result[i] = 100.0 * count / student;
		}
		for(int i=0; i<result.length; i++) {
			System.out.printf("%.3f", result[i]);
			System.out.println("%");
			scn.close();
		}
	}
}
