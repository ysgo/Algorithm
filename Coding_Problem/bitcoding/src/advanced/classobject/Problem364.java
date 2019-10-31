package advanced.classobject;

public class Problem364 {
	public static void main(String[] args) {
		Triangle2 tr = new Triangle2(3,4,5);
		tr.area();
		tr.get();
	}
}
class Triangle2 {
	double a, b, c;
	Triangle2(double a, double b, double c) {
		if(a+b<c || b+c<a || c+a<b || a<=0 || b<=0 || c<=0) {
			System.out.println("유효하지 않은 세 변의 길이입니다.");
			a = -1; b = -1; c = -1;
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
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