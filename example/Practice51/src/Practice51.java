//보건관리학과 20170809 홍은영

public class Practice51 {
	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.println(s instanceof Shape); //true
		System.out.println(s instanceof Rectangle); //false
		//하향형변환이 true가 되려면 먼저 s가 Rectangle 객체를 가리키게 하고 상향형변환 했어야 했다
		System.out.println(s instanceof Triangle); //false
		//하향형변환이 true가 되려면 먼저 s가 Triangle 객체를 가리키게 하고 상향형변환 했어야 했다
		System.out.println(s instanceof Movable); //true
		System.out.println(s instanceof Drawable); //false
		//s는 인터페이스 Drawable을 상속하지 않는다. 상속받지 않는데 compile error가 나지 않는 이유는 인터페이스는 다중 상속이 가능하기 때문에 Shape가 Drawable의 하위에 있을 수 있기 때문이다.
		
		System.out.println(r instanceof Shape); //true
		System.out.println(r instanceof Rectangle); //true
		//System.out.println(r instanceof Triangle);
		//java에는 다중 클래스 상속이 없으므로 컴파일 중에 Rectangle 객체가 Triangle이 될 수 없음을 절대적으로 알고 있기 때문이다.
		//instanceof 연산자 오른쪽에 나올 수 있는 클래스는 상속 관계에 있는 클래스로 한정한다.
		System.out.println(r instanceof Movable); //true
		System.out.println(r instanceof Drawable); //true
		
		System.out.println(t instanceof Shape); //true
		//System.out.println(t instanceof Rectangle);
		//java에는 다중 클래스 상속이 없으므로 컴파일 중에 Triangle 객체가 Rectangle이 될 수 없음을 절대적으로 알고 있기 때문이다.
		//instanceof 연산자 오른쪽에 나올 수 있는 클래스는 상속 관계에 있는 클래스로 한정한다.
		System.out.println(t instanceof Triangle); //true
		System.out.println(t instanceof Movable); //true
		System.out.println(t instanceof Drawable); //true
	}
}
