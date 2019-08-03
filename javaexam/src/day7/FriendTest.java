package day7;
class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person {
	private String phoneName;
	private String email;
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneName = phoneNum;
		this.email = email;
	}
	public String getInfo() {
		return super.getInfo() + "\t" + phoneName + "\t" + email;
	}
}

public class FriendTest {
	public static void main(String[] args) {
		Friend[] fd = new Friend[5];
		fd[0] = new Friend("�Ѽ�", "0101231234", "gmail.com");
		fd[1] = new Friend("����", "0109876532", "naver.com");
		fd[2] = new Friend("�ٻ��", "0101346854", "daum.net");
		fd[3] = new Friend("BBQ", "0101239876", "nate.com");
		fd[4] = new Friend("���Ͽ�", "0104568254", "yahoo.com");
		
		System.out.println("�̸�\t��ȭ��ȣ\t\t�����ּ�");
		System.out.println("----------------------------------");		
		for(Friend data : fd) {
			System.out.println(data.getInfo());
		}
	}
}
