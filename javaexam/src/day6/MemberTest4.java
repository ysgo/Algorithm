package day6;

class Member4 {
	String name;	//�̸�
	String account;	//����
	String passwd;	//��ȣ
	private int birthyear;	//����
	void setBirthyear(int birthyear) {
		if(birthyear < 0)
			return;
		this.birthyear = birthyear;
	}
	int getBirthyear() {
		return birthyear;
	}
	String mbPrint() {
		return  name + "(" + account
					+ ", " + passwd + ", " + birthyear + ")";
	}
}
public class MemberTest4 {
	public static void main(String[] args) {
		// ������ ������ ���
		Member4 objA[] = new Member4[3];
		objA[0] = new Member4();
		objA[0].name = "������10";
		objA[0].account = "Galaxy10";
		objA[0].passwd = "Samsung";
		objA[0].setBirthyear(-2000);
		
		objA[1] = new Member4();
		objA[1].name = "������9";
		objA[1].account = "Galaxy9";
		objA[1].passwd = "Samsung";
		objA[1].setBirthyear(2000);
		
		objA[2] = new Member4();
		objA[2].name = "������8";
		objA[2].account = "Galaxy8";
		objA[2].passwd = "Samsung";
		objA[2].setBirthyear(1000);
		
		for(int i=0; i<objA.length; i++) {
			System.out.println("ȸ��" + (i+1) + ": " + objA[i].mbPrint());			
		}
	}
}
