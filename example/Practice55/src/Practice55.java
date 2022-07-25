//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice55 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("정수를 입력하세요: ");
			String str = s.next();
			
			int num = Integer.parseInt(str);
			int[] array = new int[num];
			
			s.close();
			
			for(int i = 0; i < array.length; i++) {
				array[i] = i * 20;
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식 오류");
		} catch (NegativeArraySizeException e) {
			System.out.println("배열 크기 음수 오류");
			return;
		} catch (Exception e) {
			System.out.println("오류");
		} finally {
			System.out.println("반드시 처리할 일");
		}
		
		System.out.println("continue running");
	}
	/*음수를 입력할 경우
	 * int[] array = new int[num];에서 catch (NegativeArraySizeException e)로 이동
	 *return이 있으므로 System.out.println("continue running");은 실행되지 않는다
	 *finally는 반드시 실행된다
	 */
	
	/*
	 * 양수를 입력할 경우
	 * try에서 예외가 발생하지 않으므로 catch 문으로 가지 않고 finally 이후 실행
	 */
	
	/*
	 * 문자를 입력할 경우
	 * catch (NumberFormatException e)가 실행되고 return문이 없으므로 System.out.println("continue running"); 실행
	 * finally는 반드시 실행
	 */
}
