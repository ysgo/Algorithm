package Intermediate.ex50;
//shift �����ڸ� �̿��Ͽ� 2���� ���ڿ��� �ٲٱ�
public class BitNShiftMain {
	public static String shifts(int ��) {
		String s = "";
		for(int i = 0; i<=31; i++) {
			int ��� = ��%2;
			s = (���>=0)? ���+s : (-���)+s;
			��>>=1;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}

}
