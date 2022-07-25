//보건관리학과 20170809 홍은영

import java.util.Random;

public class Shape implements Movable{
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
		return "도형, 중심좌표: (" + getX() + ", " + getY() + ")";
	}
	
	public void move() {
		Random r = new Random();
		
		setX(r.nextInt(101));
		setY(r.nextInt(101));
	}
}
