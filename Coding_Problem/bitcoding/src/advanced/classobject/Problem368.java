package advanced.classobject;

public class Problem368 {
	public static void main(String[] args) {
		Point2 point = new Point2(3.0, 5.0);
		point.setX(7.0);
		point.setY(4.0);
		System.out.println(point.onTheAxis());
		point.move(-2.0, -1.0);
		System.out.println(point.dist(point));
	}
}
class Point2 {
	double x;
	double y;
	Point2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	double dist(Point2 p) {
		double d;
		d = Math.sqrt((p.x-this.x)*(p.x-this.x)+ (p.y-this.y)*(p.y-this.y));
		return d;
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
