//보건관리학과 20170809 홍은영

public class Shape {
	private int x;
	private int y;
	
	public int getX() { return x;}
	public void setX(int x) { this.x = x;}
	
	public int getY() { return y;}
	public void setY(int y) { this.y = y;}
	
	Shape() {
		super();
		this.x = 0;
		this.y = 0;
	}
	Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public double calcArea() {
		return -1;
	}
	
	public String toString() {
		return "중심좌표: (" + getX() + ", " + getY() + ")";
	}
}
