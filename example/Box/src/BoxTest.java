class Box {
	int width, length, height;
	int volume;
	
	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w * l * h;
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 20, 50);
		
		boolean rslt = (obj1 == obj2);
		System.out.println(rslt);
	}

}

//������� false 
//���� ������ obj1, obj2�� �����ϴ� ��ü�� �ٸ��� ����
//��� false

// �ڹٿ��� ==�� ��ü ��