package day7;

public class FileTest {
	public static void main(String[] args) {
		if(args.length == 1) 	{
			java.io.File f = new java.io.File(args[0]);
			if(f.exists()){
				if(f.isDirectory()) {
					System.out.println(args[0] + " : ���丮");
				} else {
					System.out.println(args[0] + " : " + f.length());
				}
			} else {
				System.out.println(args[0] +" : �������� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("üũ�Ϸ��� ���� �̸��� "
					                                + "���α׷� �ƱԸ�Ʈ�� �����Ͻÿ�");
		}
	}
}
