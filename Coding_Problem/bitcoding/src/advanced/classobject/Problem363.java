package advanced.classobject;

public class Problem363 {
	public static void main(String[] args) {
		Triangle tr = new Triangle(3,4,5);
		tr.area();
		tr.get();
	}
}
class Triangle {
	double a, b, c;
	Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	double area() {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	void get() {
		if(a==b && b==c) {
			System.out.println("정삼각형입니다.");
		} else if(a*a + b*b == c) {
			System.out.println("직각삼각형입니다.");
		} else {
			System.out.println("삼각형입니다.");
		}
	}
}