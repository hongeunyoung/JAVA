//보건관리학과 20170809 홍은영

public class Practice52 {
	public static void main(String[] args) {
		Movable[] rArray = new Movable[2];
		
		rArray[0] = new Rectangle();
		rArray[1] = new Triangle();
		
		System.out.println(rArray[0] instanceof Rectangle); //true
		//rArray[0]는 Rectangle 객체의 참조변수이기 때문에 true
		System.out.println(rArray[0] instanceof Triangle); //false
		//Rectangle과 Triangle은 상속관계가 아니다.
		System.out.println(rArray[0] instanceof Movable); //true
		//Rectangle은 Shape를 상속받고 Shape는 Movable을 상속받는다.
		System.out.println(rArray[0] instanceof Drawable); //true
		//Rectangle은 Drawable을 상속받는다.
		
		System.out.println(rArray[1] instanceof Rectangle); //false
		//rArray[1]는 Triangle 객체의 참조변수이기 때문에 Rectangle과 상속 관계가 아니라서 false
		System.out.println(rArray[1] instanceof Triangle); //true
		//rArray[1]은 Triangle의 참조변수이기 때문에 true
		System.out.println(rArray[1] instanceof Movable); //true
		//Triangle은 Shape를 상속받고 Shape는 Movable을 상속받는다.
		System.out.println(rArray[1] instanceof Drawable); //true
		//Triangle은 Drawable을 상속받는다.
	}
}
