	//보건관리학과 20170809 홍은영

public class MyBox<T> {
	private T s;
	
	public MyBox(T s) {
		this.s = s;
	}
	
	void set(T s) {
		this.s = s;
	}
	
	T get() {
		return s;
	}
}
