package day6;
class Student {
	String name;
	String project;
	int age;
	void study() {
		System.out.println(name + "�л��� " + project + "�� �����մϴ�.");
	}
	String getStudentInfo() {
		return "�̸� : " + name + ", ���� : " + age;
	}
}
public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "�Ѹ�";
		student1.project = "����";
		student1.age = 10;
		student1.study();
		System.out.println(student1.getStudentInfo());
		
		Student student2 = new Student();
		student2.name = "��ũ";
		student2.project = "����";
		student2.age = 24;
		student2.study();
		System.out.println(student2.getStudentInfo());
		student1 = student2;
		System.out.println("stuent1 = student2 ������ ��");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1.name);
		System.out.println(student2.name);
	}
}
