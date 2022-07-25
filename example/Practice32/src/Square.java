//보건관리학과 20170809 홍은영

public class Square {
	private int width;
	private int height;
	
	public void setWidth(int width) {this.width = width;}
	public int getWidth() {return width;}
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	private int area() {
		return this.width * this.height;
	}
	
	public boolean isSmallerThan(Square s) {
		if(area() < s.area())
			return true;
		
		return false;
	}
}
