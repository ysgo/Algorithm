package day7;

import java.util.Date;

class Parent {
	int num=1;
}
class Child extends Parent {
	public String toString() { // �޼��� �������̵�
		return "Child ��ü�Դϴ�!!";
	}
}

public class ParentChildTest {
	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println(obj.toString());
		Child obj2 = new Child();
		System.out.println(obj2.toString());
		System.out.println(obj.num);
		System.out.println(obj2.num);
		System.out.println("��ü�� ����: " + obj);
		System.out.println("��ü�� ���� : " + obj2);
		Date d = new Date();
		System.out.println("��ü�� ���� : " + d);
	}
}
