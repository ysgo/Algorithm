package day5;

public class MethodLab4 {
	public static void main(String[] args) {
		System.out.println("���� ū ���� " + 
				maxNumArray(new int[] {10, 20, 30}) + " �Դϴ�.");
		System.out.println("���� ū ���� " + 
				maxNumArray(new int[] {100, 500, 300, 200, 400}) + " �Դϴ�.");
		System.out.println("���� ū ���� " + 
				maxNumArray(new int[] {1, 10, 3, 4, 5, 8, 7, 6, 9, 2}) + " �Դϴ�.");
	}
	static int maxNumArray(int[] num) {
		int max = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i] > max)
				max = num[i];
		}
		return max;
	}
}
