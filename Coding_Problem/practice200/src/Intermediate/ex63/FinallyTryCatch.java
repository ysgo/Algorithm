package Intermediate.ex63;
//���� ���꿡�� �߻��ϴ� ���� ó���ϱ�
public class FinallyTryCatch {

	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 20 / (5-x);
			System.out.println(y);
		} catch(ArithmeticException e ) {
			System.out.println("==>0���� ������ Ȯ���� ��!!!");
		} finally {
			System.out.println("�� ����Ǿ�߸� ��!!!");
		}
	}

}
