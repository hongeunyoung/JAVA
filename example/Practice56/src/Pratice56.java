//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Pratice56 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean isDone;
		int[] n = new int[2];
		
		//1번 피연산자, 2번 피연산자를 입력받아야 해서 반복문 사용.
		for(int i = 0; i < n.length; i++) {
			isDone = false;
			
			while(isDone != true) {
				try {
					System.out.println((i + 1) + "번 피연산자를 입력하세요: ");
					String str = s.next();
					
					n[i] = Integer.parseInt(str);
					
					//위에서 오류가 나지 않으면 isDone이 true가 돼서 while문이 종료된다.
					isDone = true;
				//입력받은 것이 숫자가 아니면 예외가 발생한다. 예외가 발생했을때 실행되는 블록.
				} catch (NumberFormatException e) {
					System.out.println("잘못된 형식의 숫자입니다. 다시 입력하세요.");
				}
			}
		}
		
		s.close();
		
		System.out.println(n[0] + " + " + n[1] + " = " + (n[0] + n[1]));
	}
}
