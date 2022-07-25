//보건관리학과 20170809 홍은영

public class BodyData {
	private int weight;
	private int height;
	
	public int setWeight() {return weight;}
	public void getWeight(int weight) {this.weight = weight;}
	
	public int setHeight() {return height;}
	public void getHeight(int height) {this.height = height;}
	
	public int idealWeight() {
		return height - 110;
	}
	
	public boolean needDiet() {
		if(weight > idealWeight()) {
			return true;
		}
		
		return false;
	}
	
	public boolean isTallerThan(BodyData b) {
		if(height >= b.height)
			return true;
		
		return false;
	}
}
