package day8;

public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("������"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:\\"));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new int[10]);
		printObjectInfo(new double[5][3]);
	}
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("String��ü�� ���޵�!!! - " + o.toString() + 
					"(" + o.toString().length() + ")");
		} else {
			System.out.println("���޵� ��ü�� Ŭ������" + o.getClass().getName());			
		}
	}
}
