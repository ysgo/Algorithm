package Intermediate.ex49;
//�������� �̿��Ͽ� �Ҽ� �Ǻ��ϱ�
public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS = true;
		for(int i = 2; i<=(int)Math.sqrt(n); i++) {
			if(n%i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	
	public static void main(String[] args) {
		int number = 1234567;
		boolean ifPrime = isPrime(number);
		if(ifPrime) {
			System.out.printf("%�� 1�� �ڽ����θ� ������������ �Ҽ���.", number);
		} else {
			System.out.printf("%d�� �Ҽ��� �ƴϴ�.", number);
		}
	}

}
