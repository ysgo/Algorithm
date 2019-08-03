package day11;

class Value {
	int value;
	Value(int value) {
		this.value = value;
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj != null & obj instanceof Value)
			if(value == ((Value)obj).value)
				result = true;
		return result;	
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		
		/*Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(30);
		System.out.println(v1.equals(null));		
		System.out.println(v1.equals(v3));		
		System.out.println(v1.equals(v2));		
		System.out.println(v1.equals(new Date()));		

		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		v2 = v1;
		if(v1.equals(v2))
			System.out.println("v1�� v2�� �����ϴ�.");
		else
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		 */
		String s1 = "������";
		String s2 = "������";
		String s3 = new String("������");
		String s4 = new String("������");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		
	}
}
