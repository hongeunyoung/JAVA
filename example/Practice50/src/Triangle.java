//보건관리학과 20170809 홍은영

public class Triangle extends Shape implements Drawable {
	private double base;
	private double height;
	
	public double getBase() { return base;}
	public void setBase(double base) { this.base = base;}
	
	public double getHeight() { return height;}
	public void setHeight(double height) { this.height = height;}
	
	Triangle() {
		super();
		setBase(0);
		setHeight(0);
	}
	
	Triangle(int x, int y) {
		super(x, y);
		setBase(0);
		setHeight(0);
	}
	
	Triangle(int x, int y, double base, double height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	
	public double calcArea() {
		return getBase() * getHeight() / 2;
	}
	
	public String toString() {
		return super.toString() + ", 밑변: " + getBase() + ", 높이: " + getHeight() + ", 면적: " + calcArea();
	}
	
	public void draw() {
		System.out.println("삼각형, " + toString());
	}
}
