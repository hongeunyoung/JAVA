//보건관리학과 20170809 홍은영

public class HealthData<W, H> {
	private String name;
	private W weight;
	private H height;
	
	public HealthData(String name, H height, W weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setWeight(W weight) {
		this.weight = weight;
	}
	
	W getWeight() {
		return weight;
	}
	
	void setHeight(H height) {
		this.height = height;
	}
	
	H getHeight() {
		return height;
	}
	
	public String toString() {
		return "(" + getName() + ", " + getWeight() + ", " + getHeight() + ")";
	}
}
