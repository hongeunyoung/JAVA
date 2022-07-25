//보건관리학과 20170809 홍은영

public class Point {
	public int x, y;
	
	public int getX() { return x;}
	public void setX(int x) { this.x = x;}
	
	public int getY() { return y;}
	public void setY(int y) { this.y = y;}
	
	public Point() {}
	
	public String toString() {
		return "중심좌표 : (" + getX() + ", " + getY() + ")";
	}
}
