//���ǰ����а� 20170809 ȫ����

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
		return super.toString() + ", �غ�: " + getBase() + ", ����: " + getHeight() + ", ����: " + calcArea();
	}
	
	public void draw() {
		System.out.println("�ﰢ��, " + toString());
	}
}
