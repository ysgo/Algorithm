package day6;

class Member3 {
	String name;	//�̸�
	String account;	//����
	String passwd;	//��ȣ
	int birthyear;	//����
	
	Member3() {
		System.out.println("��ü ����");
	}
	/*
	Member3(String n, String a, String p, int by) {
		name = n;
		account = a;
		passwd = p;
		birthyear = by;
	}
	*/
	Member3(String name, String account, String passwd, int birthyear) {
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthyear = birthyear;
	}
	
	String mbPrint() {
		return  name + "(" + account
					+ ", " + passwd + ", " + birthyear + ")";
	}
}
public class MemberTest3 {
	public static void main(String[] args) {
		// ������ ������ ���
		Member3 objA[] = new Member3[3];
		objA[0] = new Member3("������10", "Galaxy10", "Samsung", 1);
		
		objA[1] = new Member3("������9", "Galaxy9", "Samsung", 2);
		objA[2] = new Member3("������8", "Galaxy8", "Samsung", 3);
		
		for(int i=0; i<objA.length; i++) {
			System.out.println("ȸ��" + (i+1) + ": " + objA[i].mbPrint());			
		}
	}
}
