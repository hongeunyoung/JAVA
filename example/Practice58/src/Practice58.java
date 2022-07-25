//보건관리학과 20170809 홍은영

@SuppressWarnings("serial")

class MyException extends Exception {
	public MyException(String message) {super(message);}
}

public class Practice58 {
	public static void checkNegative(int number) throws MyException {
		if (number < 0) {
			throw (new MyException("음수는 안됩니다."));
		}
		
		System.out.println("다행히 음수가 아니군요");
	}
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1); 
			// number < 0 이기 때문에 checkNegative에서 정의한 대로 오류 발생
		} catch (MyException ex) {ex.printStackTrace();} 
		//오류가 발생하면 호출스택을 출력해서 에러 코드에 checkNegative가 뜬다.
	}
}
