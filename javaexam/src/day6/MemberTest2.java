package day6;

class Member2 {
	String name;	//�̸�
	String account;	//����
	String passwd;	//��ȣ
	int birthyear;	//����
	String mbPrint() {
		return  name + "(" + account
					+ ", " + passwd + ", " + birthyear + ")";
	}
}
public class MemberTest2 {
	public static void main(String[] args) {
		// ������ ������ ���
		Member2 objA[] = new Member2[3];
		objA[0] = new Member2();
		objA[0].name = "������10";
		objA[0].account = "Galaxy10";
		objA[0].passwd = "Samsung";
		objA[0].birthyear = 1;
		
		objA[1] = new Member2();
		objA[1].name = "������9";
		objA[1].account = "Galaxy9";
		objA[1].passwd = "Samsung";
		objA[1].birthyear = 2;
		
		objA[2] = new Member2();
		objA[2].name = "������8";
		objA[2].account = "Galaxy8";
		objA[2].passwd = "Samsung";
		objA[2].birthyear = 3;
		
		for(int i=0; i<objA.length; i++) {
			System.out.println("ȸ��" + (i+1) + ": " + objA[i].mbPrint());			
		}
	}
}
