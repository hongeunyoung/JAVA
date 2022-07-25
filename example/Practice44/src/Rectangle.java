//���ǰ����а� 20170809 ȫ����

public class Rectangle extends Shape {
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
		setLength(0);
		setWidth(0);
	}
	
	public double calcArea() {
		return getLength() * getWidth();
	}
	
	public String toString() {
		return super.toString() + ", ����: " + getLength() + ", ����: " + getWidth() + ", ����: " + calcArea();
	}
}
