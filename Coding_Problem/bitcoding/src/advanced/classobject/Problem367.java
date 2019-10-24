package advanced.classobject;

public class Problem367 {
	public static void main(String[] args) {
		Point point = new Point(3.0, 5.0);
		point.setX(7.0);
		point.setY(4.0);
		System.out.println(point.onTheAxis());
		point.move(-2.0, -1.0);
	}
}
class Point {
	double x;
	double y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	void setX(double x) {
		this.x = x;
	}
	void setY(double y) {
		this.y = y;
	}
	boolean onTheAxis() {
		if(x*y == 0) { return true; }
		return false;
	}
	void move(double dx, double dy) {
		x += dx;
		y += dy;
	}
}
