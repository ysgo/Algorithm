package advanced.classobject;

public class Problem365 {
	public static void main(String[] args) {
		SalesHistory sh = new SalesHistory("a", 'b', 1, 12);
		System.out.println(sh.custAge);
	}
}
class SalesHistory {
	String custName;
	char gender;
	int price;
	int custAge;
	SalesHistory(String c, char g, int p, int age) {
		this.custName = c;
		this.gender = g;
		this.price = p;
		this.custAge = age;
	}
	SalesHistory(int p) {
		this.price = p;
		custName = null;
		gender = '?';
		custAge = -1;
	}
}