//보건관리학과 20170809 홍은영

import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("serial")
class InvalidInputException extends Exception {
	public InvalidInputException(String message) {super(message);}
}

public class Practice61 {
	public static void checkNegative(String player) throws InvalidInputException {
		if(player.equals("가위") == false && player.equals("바위") == false && player.equals("보") == false)  {
			throw (new InvalidInputException("잘못된 입력입니다. 다시 입력하세요."));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player = "";
		
		int computerRand = rg.nextInt(3);
		
		if(computerRand == 0) {
			computer = "가위";
		}
		else if(computerRand == 1) {
			computer = "바위";
		}
		else {
			computer = "보";
		}
		
		System.out.println("컴퓨터의 생성: " + computer);
		
		player = getValidInput(sc);
		
		if(whoswin(computer, player) == 1) {
			System.out.println("당신이 이겼습니다.");
		}
		else if(whoswin(computer, player) == -1) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
		
		sc.close();
	}
	
	public static int whoswin(String com, String you) {
		if((com.equals("가위") && you.equals("바위")) || (com.equals("바위") && you.equals("보")) || (com.equals("보") && you.equals("가위"))) {
			return 1;
		}
		else if((com.equals("가위") && you.equals("보")) || (com.equals("바위") && you.equals("가위")) || (com.equals("보") && you.equals("바위"))) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static String getInput(Scanner s) throws InvalidInputException {
		System.out.print("당신의 입력: ");
		String rslt = s.next();
		
		return rslt;
	}
	
	public static String getValidInput(Scanner s) {
		String player = "";
		boolean flag = true;
		
		while(flag) {
			try {
				player = getInput(s);
				checkNegative(player);
				
				flag = false;
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
		
		return player;
	}
}
