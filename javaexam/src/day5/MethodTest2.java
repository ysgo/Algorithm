package day5;

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(3); // �ƱԸ�Ʈ �ʼ�
		System.out.println("main() ��������");
	}
	static void printMyName(int num) { // �Ű������� ������
		for(int i=1; i<=num; i++) {
			System.out.println("Repeat");
		}
	}
}
