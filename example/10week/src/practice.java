
public class practice {
	public static int add(int x, int y) {
		System.out.print("10 + 20 = ");
		return (x + y);
	}
	public static void main(String[] args) {
		//원하는 결과를 나오게 하기 위해선 분리해야함
		System.out.println("연산결과는 " + add(10, 20) + "입니다.");
	}
}
