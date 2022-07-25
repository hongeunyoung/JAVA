//���ǰ����а� 20170809 ȫ����

public abstract class Shape {
	private int x;
	private int y;
	
	//�߻�Ŭ������ �Ǿ� ������� �ʰ� ����� �� ���� ������ ��ӱ��� ������ protected�� ����ص� �ȴ�.
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
		return "�߽���ǥ: (" + getX() + ", " + getY() + ")";
	}
}
