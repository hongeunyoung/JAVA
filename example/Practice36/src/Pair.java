//보건관리학과 20170809 홍은영

public class Pair {
	private Integer x;
	private Integer y;
	
	public Pair(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Integer getX() { return x;}
	public void setX(Integer x) { this.x = x;}
	
	public Integer getY() { return y;}
	public void setY(Integer y) { this.y = y;}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public static Pair add(Pair a, Pair b) {
		return new Pair((a.getX() + b.getX()), (a.getY() + b.getY()));
	}
	
	public static Pair sub(Pair a, Pair b) {
		return new Pair((a.getX() - b.getX()), (a.getY() - b.getY()));
	}
	
	public static Pair mult(Pair a, Pair b) {
		return new Pair((a.getX() * b.getX()), (a.getY() * b.getY()));
	}
	
	public static Pair div(Pair a, Pair b) {
		return new Pair((a.getX() / b.getX()), (a.getY() / b.getY()));
	}
}
