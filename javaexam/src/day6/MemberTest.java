package day6;

class Member {
	String name;	//�̸�
	String account;	//����
	String passwd;	//��ȣ
	int birthyear;	//����
	String mbPrint() {
		return  name + "(" + account
					+ ", " + passwd + ", " + birthyear + ")";
	}
}
public class MemberTest {
	public static void main(String[] args) {
		// ������ ������ ���
		Member mb1 = new Member();
		mb1.name = "������10";
		mb1.account = "Galaxy10";
		mb1.passwd = "Samsung";
		mb1.birthyear = 1;
		
		Member mb2 = new Member();
		mb2.name = "������9";
		mb2.account = "Galaxy9";
		mb2.passwd = "Samsung";
		mb2.birthyear = 2;
		
		Member mb3 = new Member();
		mb3.name = "������8";
		mb3.account = "Galaxy8";
		mb3.passwd = "Samsung";
		mb3.birthyear = 3;
		
		System.out.println("ȸ��1 : " + mb1.mbPrint());
		System.out.println("ȸ��2 : " + mb2.mbPrint());
		System.out.println("ȸ��3 : " + mb3.mbPrint());
	}
}
