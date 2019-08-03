package day11;

import java.util.Iterator;
import java.util.LinkedList;

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

public class FriendTestLinkedList {
	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("�Ѽ�", "0101231234", "gmail.com"));
		list.add(new Friend("����", "0109876532", "naver.com"));
		list.add(new Friend("�ٻ��", "0101346854", "daum.net"));
		list.add(new Friend("BBQ", "0101239876", "nate.com"));
		list.add(new Friend("���Ͽ�", "0104568254", "yahoo.com"));
		System.out.println("�̸�\t��ȭ��ȣ\t\t�����ּ�");
		System.out.println("----------------------------------");
		Iterator<Friend> it = list.iterator();
		while (it.hasNext()) {
            Friend str = it.next();
            System.out.println(str.getInfo());
        }
	}
}
