//���ǰ����а� 20170809 ȫ����

public class Point {
	public int x, y;
	
	public int getX() { return x;}
	public void setX(int x) { this.x = x;}
	
	public int getY() { return y;}
	public void setY(int y) { this.y = y;}
	
	public Point() {}
	
	public String toString() {
		return "�߽���ǥ : (" + getX() + ", " + getY() + ")";
	}
}
