package day5;

public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(1, '*'); // �ƱԸ�Ʈ �ʼ�
		printName("��ũ", '$'); // �ƱԸ�Ʈ �ʼ�
		System.out.println("main() ��������");
	}
	static void printMyName(int num, char deco) { // �Ű������� ������
		for(int i=1; i<=num; i++) {
			System.out.println(deco + "Repeat" + deco);
		}
	}
	static void printName(String name, char deco) { // �Ű������� ������
			System.out.println(deco + name + deco);
	}
	
}
