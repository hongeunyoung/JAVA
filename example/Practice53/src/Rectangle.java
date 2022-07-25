//보건관리학과 20170809 홍은영

public class Rectangle extends Shape implements Drawable {
	private double length;
	private double width;
	
	public double getLength() { return length;}
	public void setLength(double length) { this.length = length;}
	
	public double getWidth() { return width;}
	public void setWidth(double width) { this.width = width;}
	
	Rectangle() {
		super();
		setLength(0);
		setWidth(0);
	}
	
	Rectangle(int x, int y) {
		super(x, y);
		setLength(0);
		setWidth(0);
	}
	
	Rectangle(int x, int y, double length, double width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	
	public double calcArea() {
		return getLength() * getWidth();
	}
	
	public String toString() {
		String rslt = "사각형, 중심좌표: (" + getX() + ", " + getY() + ")";
		rslt += ", 가로: " + getLength() + ", 세로: " + getWidth() + ", 면적: " + calcArea();
		
		return rslt;
	}
	
	public void draw() {
		System.out.println("사각형, " + toString());
	}
}
