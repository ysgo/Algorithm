package day3;

public class WhileLab1 {
	public static void main(String[] args) {
		int numRan;
		numRan = (int) (Math.random() * 5) + 5; // 5 ~ 10
		//  while ��
		int i = 1;
		while (i <= numRan) {
			System.out.printf("%d -> %d\n", i, i * i);
			i++;
		}
		System.out.println();
		
		// for ��
		for (int j = 1; j <= numRan; j++) {
			System.out.printf("%d -> %d\n", j, j * j);
		}
	}
}
