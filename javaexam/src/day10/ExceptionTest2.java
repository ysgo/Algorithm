package day10;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("�������");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;		
			System.out.println("���� ��� : " + result);
		} catch(Exception e) {
			System.out.println(e);
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���α׷� �ƱԸ�Ʈ�� �����ϼ���");
		} catch(ArithmeticException e) {
			System.out.println("���α׷� �ƱԸ�Ʈ�� �����ϼ���");
		} */finally {
			System.out.println("�׻� ����");
		}
		System.out.println("��������");	
	}
}
