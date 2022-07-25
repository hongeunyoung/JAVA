//보건관리학과 20170809 홍은영

public class Circle {
	private Point center;
	private int radius;
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle() {
		center = new Point();
		center.setX(0);
		center.setY(0);
		radius = 0;
	}

	public Circle(int x, int y, int radius) {
		center = new Point();
		center.setX(x);
		center.setY(y);
		this.radius = radius;
	}
	
	public Circle (Point p, int radius) {
		center = new Point();
		center = p;
		this.radius = radius;
	}
	
	public String toString() {
		return center.toString() + "\n반지름 : " + getRadius();
	}
}
