package day2;

public class WhileTest2 {
	public static void main(String[] args) {
		int lottoNum;
		while (true) {
			lottoNum = (int) (Math.random() * 6) + 1;
			if (lottoNum == 3) {
				System.out.printf("��÷!! ������ : %d\n", +lottoNum);
				break;
			} else {
				System.out.printf("��õ�!! �ФФ� : %d\n", +lottoNum);
			}
		}
		System.out.printf("%s\n", "��������...");
	}
}
