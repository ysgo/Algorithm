package Intermediate.ex69;
//StringBuffer�� ���ڿ� ����, ����, �߰��ϱ�
public class StringBufferMain {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("�ȳ��ϼ���.")
			.append("�� ������.")
			.append("��θ� ����ؿ�. ��ٷ���.");
		System.out.println(sb1.toString() + sb1.hashCode());
		
		sb1.replace(0, 2, "�� ���Ⱑ ���ܿ�");
		System.out.println(sb1.toString() + sb1.hashCode());
		
		sb1.reverse();
		System.out.println(sb1.toString());
		
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		
		replaces(sb1);
		System.out.println(sb1.toString());
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
	}

}
