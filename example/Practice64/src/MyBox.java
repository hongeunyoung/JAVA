	//���ǰ����а� 20170809 ȫ����

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
