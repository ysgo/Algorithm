package day5;

public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(1, '*'); // �ƱԸ�Ʈ �ʼ�
		printMyName(2, '@'); // �ƱԸ�Ʈ �ʼ�
		printMyName(3, '#'); // �ƱԸ�Ʈ �ʼ�
		System.out.println("main() ��������");
	}
	static void printMyName(int num, char deco) { // �Ű������� ������
		for(int i=1; i<=num; i++) {
			System.out.println(deco + "Repeat" + deco);
		}
	}
}
