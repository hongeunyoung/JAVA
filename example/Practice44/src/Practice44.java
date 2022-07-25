//보건관리학과 20170809 홍은영

public class Practice44 {
	public static void main(String[] args) {
		Shape[] sArray = new Shape[3];
		
		sArray[0] = new Shape();
		sArray[1] = new Rectangle();
		sArray[2] = new Triangle();
		
		//sArray[0]은 Shape 타입이기 때문에 true
		System.out.println(sArray[0] instanceof Shape);
		//하향형변환이 가능하게 하는 코드가 아니다.
		//Shape 타입이기 때문에 Rectangle의 소속변수들을 가지지 못한다.
		System.out.println(sArray[0] instanceof Rectangle);
		//하향형변환이 가능하게 하는 코드가 아니다.
		//Shape 타입이기 때문에 Triangle의 소속변수들을 가지지 못한다.
		System.out.println(sArray[0] instanceof Triangle);
		//Rectangle은 Shape을 상속하기 때문에 상향형변환이 가능하다.
		System.out.println(sArray[1] instanceof Shape);
		//sArray[1]은 Rectangle 타입이기 때문에 true
		System.out.println(sArray[1] instanceof Rectangle);
		//Rectangle과 Triangle은 서로 상속 관계가 아니기 때문에 형변환이 불가능하다.
		System.out.println(sArray[1] instanceof Triangle);
		//Triangle은 Shape을 상속하기 때문에 상향형변환이 가능하다.
		System.out.println(sArray[2] instanceof Shape);
		//Rectangle과 Triangle은 서로 상속 관계가 아니기 때문에 형변환이 불가능하다.
		System.out.println(sArray[2] instanceof Rectangle);
		//sArray[2]은 Triangle 타입이기 때문에 true
		System.out.println(sArray[2] instanceof Triangle);
	}
}
