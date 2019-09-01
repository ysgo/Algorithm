package hard.arraylist;

import java.util.ArrayList;

public class Example287 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(2); a.add(5); a.add(3);
		b.add(1); b.add(6);
		a.addAll(b);
		a.add(2);
		for(int i=0; i<a.size(); i++) {
			System.out.printf("%d ", a.get(i));
		}
		System.out.println();
		
		System.out.println(a.contains(6));
		System.out.println(a.indexOf(2));
		System.out.println(a.indexOf(9));
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b.isEmpty());
		
		a.remove(5);
		a.remove(2);
		System.out.println(a.toString());
	}
}
