package day5;

public class MethodTest7 {
	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length == 0) {
			System.out.println("���޵� ���α׷� �ƱԸ�Ʈ�� ����!");
			return;
		}
		for(String data : args) {
			System.out.println(data);
		}
		System.out.println("���α׷� �ƱԸ�Ʈ�� " + args.length + 
				"�� �����߽��ϴ�!");
	}
}
