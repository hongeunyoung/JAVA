//보건관리학과 20170809 홍은영

public class MyPair<T> {
	T first, second;
	
	public MyPair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	void setFirst(T first) {
		this.first = first;
	}
	
	T getFirst() {
		return first;
	}
	
	void setSecond(T second) {
		this.second = second;
	}
	
	T getSecond() {
		return second;
	}
	
	public String toString() {
		return "(" + getFirst() + ", " + getSecond() + ")";
	}
}
