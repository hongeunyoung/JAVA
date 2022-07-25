//���ǰ����а� 20170809 ȫ����

public class Autoboxing {
	public static int add(int x, int y) {
		return (x + y);
	}
	
	public static Integer addRef(Integer x, Integer y) {
		return (x + y); //auto-unboxing 2���� auto-boxing
	}
	
	public static void main(String[] args) {
		Integer x = 10; //auto-boxing
		Integer y = 20; //auto-boxing
		
		Integer z = add(x, y); //add(x, y)�� auto-unboxing �� add(x, y) ��ȯ���� int �̹Ƿ� auto-boxing
		int w = addRef(x, y); //addRef(x, y) auto-unboxing
		int v = addRef(10, 20); //addRef(10,20) auto-boxing ��ȯ �� auto-unboxing
		
		System.out.println(z); 
		System.out.println(w);
		System.out.println(v);
	}
}

//@Suppress Warning ���� ���� �ʱ�
