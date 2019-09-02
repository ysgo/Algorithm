package hard.arraylist;

import java.util.ArrayList;

public class Example285 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Hello");
		a.add(new Integer(3));
		a.add(1, 3.14);
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
