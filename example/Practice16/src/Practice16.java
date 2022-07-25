//보건관리학과 20170809 홍은영

import java.util.Scanner;
import java.util.Random;

public class Practice16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player;
		int comCount = 0, youCount = 0, draw = 0;
		
		while(true)
		{
			System.out.println("현재 당신의 전적: " + youCount + "승 " + comCount + "패 " + draw + "무");
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
				System.out.print("당신의 입력(가위/바위/보/그만): ");
				player = sc.next();
				
				if(player.equals("가위") || player.equals("바위") || player.equals("보") || player.equals("그만")) {
					break;
				}
				else {
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				}
			}
			
			if(player.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(whoswin(computer, player) == 1) {
				youCount++;
				System.out.println("당신이 이겼습니다.");
			}
			else if(whoswin(computer, player) == -1) {
				comCount++;
				System.out.println("컴퓨터가 이겼습니다.");
			}
			else {
				draw++;
				System.out.println("비겼습니다.");
			}
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

}
