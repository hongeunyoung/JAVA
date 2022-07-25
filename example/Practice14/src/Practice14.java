//보건관리학과 20170809 홍은영

import java.util.Scanner;
import java.util.Random;

public class Practice14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player;
		
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
		
		while(true)
		{
			System.out.print("당신의 입력: ");
			player = sc.next();
			
			if(player.equals("가위") || player.equals("바위") || player.equals("보")) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
		
		if((computer.equals("가위") && player.equals("바위")) || (computer.equals("바위") && player.equals("보")) || (computer.equals("보") && player.equals("가위"))) {
			System.out.println("당신이 이겼습니다.");
		}
		else if((computer.equals("가위") && player.equals("보")) || (computer.equals("바위") && player.equals("가위")) || (computer.equals("보") && player.equals("바위"))) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
		
		sc.close();
	}
}
