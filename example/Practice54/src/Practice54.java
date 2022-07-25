//보건관리학과 20170809 홍은영

public class Practice54 {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try: " + n);
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} finally {
			System.out.println("finally");
		}
		System.out.println("continue running");
		
		//실행결과 예측
		/*
		숫자 형식 오류
		finally
		continue running
		*/
		
		// int n = Integer.parseInt("abc"); 여기서 "abc"는 int형이 아니기 때문에 NumberFormatException이 발생
		//아래줄인 System.out.println("try"); 은 건너뛰고 catch문으로 들어가게 된다
		//finally는 try가 끝나면 반드시 실행되므로 System.out.println("finally"); 출력됨
		//catch에 return이 없었으므로 System.out.println("continue running");은 실행된다
	}
}
