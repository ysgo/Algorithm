package exercise;

class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Human() { }
	Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	String printInformation() {
		return name +"\t" +  age + "\t" + height + "\t" + weight;
	}
}

class Student extends Human {
	private String number;
	private String major;
	
	Student() { }
	Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	String printInformation() {
		return super.printInformation() + "\t" + number + "\t" + major;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student arrays [] = new Student[3];
		arrays[0] = new Student("ȫ�浿", 20, 171, 81, "201101", "����");
		arrays[1] = new Student("��浿", 21, 183, 72, "201102", "����");
		arrays[2] = new Student("�ڱ浿", 22, 175, 65, "201103", "�İ�");
		for(Student data : arrays)
			System.out.println(data.printInformation());			
	}
}
