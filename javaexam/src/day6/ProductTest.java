package day6;

public class ProductTest {
	public static void main(String[] args) {
		Product[] pd = new Product[5];
		pd[0] = new Product();
		pd[1] = new Product("����������", 3, 12000);
		pd[2] = new Product("���������", 1, 9000);
		pd[3] = new Product("�ݴް�����", 2, 16000);
		pd[4] = new Product("ȣ��������", 6, 20000);
		
		for(int i=0; i<pd.length; i++) {
			System.out.print("��ǰ�̸� : " + pd[i].getName() + ", ��� : " + 
					pd[i].getBalance() + ", �ݾ� : ");
			System.out.printf("%,d��\n", pd[i].getPrice());
		}
	}
}
