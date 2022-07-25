//보건관리학과 20170809 홍은영

public abstract class Shape {
	private int x;
	private int y;
	
	//추상클래스가 되어 상속하지 않고 사용할 수 없기 때문에 상속까지 가능한 protected를 사용해도 된다.
	protected int getX() { return x;}
	protected void setX(int x) { this.x = x;}
	
	protected int getY() { return y;}
	protected void setY(int y) { this.y = y;}
	
	Shape() {
		this(0, 0);
	}
	Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract double calcArea();
	
	public String toString() {
		return "중심좌표: (" + getX() + ", " + getY() + ")";
	}
}
