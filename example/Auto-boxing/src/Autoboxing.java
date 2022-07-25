//보건관리학과 20170809 홍은영

public class Autoboxing {
	public static int add(int x, int y) {
		return (x + y);
	}
	
	public static Integer addRef(Integer x, Integer y) {
		return (x + y); //auto-unboxing 2번후 auto-boxing
	}
	
	public static void main(String[] args) {
		Integer x = 10; //auto-boxing
		Integer y = 20; //auto-boxing
		
		Integer z = add(x, y); //add(x, y)는 auto-unboxing 후 add(x, y) 반환값이 int 이므로 auto-boxing
		int w = addRef(x, y); //addRef(x, y) auto-unboxing
		int v = addRef(10, 20); //addRef(10,20) auto-boxing 반환 후 auto-unboxing
		
		System.out.println(z); 
		System.out.println(w);
		System.out.println(v);
	}
}

//@Suppress Warning 절대 쓰지 않기
