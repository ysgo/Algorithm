package day2;

public class ForLab1 {
	public static void main(String[] args) {

		int evenSum = 0;
		int oddSum = 0;
		for (int num = 1; num <= 100; num++) {
			int rawNum = num % 2;
			if (rawNum == 1) {
				oddSum += num;
			} else {
				evenSum += num;
			}
		}
		System.out.println("1 ���� 100 ������ ���ڵ� �߿���" + "\n" + "¦���� ���� " + 
		evenSum + "�̰�" + "\n" + "Ȧ���� ���� " + oddSum + "�̴�.");
	}

//		int evenSum = 0;
//		for (int evenNum = 0; evenNum <= 100; evenNum += 2) {
//			evenSum += evenNum;
//			System.out.println("�հ� : " + evenSum);
//		}
}
