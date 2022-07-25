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

//결과예측 false 
//값은 같지만 obj1, obj2가 참조하는 객체는 다르기 때문
//결과 false

// 자바에선 ==는 객체 비교