package Intermediate.ex67;
//String(���ڿ�) �����ϱ�
public class StringTest {

	public static void main(String[] args) {
		String text = " Hello Java4Android";
		String com = " HEllo Java4Android";
		
		System.out.println(text.charAt(2));
		System.out.println(text.concat("s"));
		System.out.println(text.contains("And"));
		System.out.println(text.equals(com));
		System.out.println(text.equalsIgnoreCase(com));
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
		System.out.println(text.trim());
		System.out.println(text.length());
		System.out.println(text.substring(7));
		System.out.println(text.substring(7, 11));
		System.out.println(text.replace(" ", "-"));
		System.out.println(text.replaceAll(" ", "-"));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		String[] sp = text.split(" ");
		for(int i = 0; i<sp.length; i++) {
			System.out.println(i + "\t" + sp[i] + "\t" + sp[i].length());
		}
	}

}
