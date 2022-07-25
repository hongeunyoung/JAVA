//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String player1 = "철수", player2 = "영희";
		
		String chul = Play(player1, sc);
		String young = Play(player2, sc);
		
		if((chul.equals("가위") && young.equals("바위")) || (chul.equals("바위") && young.equals("보")) || (chul.equals("보") && young.equals("가위"))) {
			System.out.println("영희가 이겼습니다.");
		}
		else if((chul.equals("가위") && young.equals("보")) || (chul.equals("바위") && young.equals("가위")) || (chul.equals("보") && young.equals("바위"))) {
			System.out.println("철수가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
		
		sc.close();
	}
	
	public static String Play(String player, Scanner sc) {
		String select;
		
		while(true)
		{
			System.out.print(player + "의 입력: ");
			select = sc.next();
			
			if(select.equals("가위")|| select.equals("바위")|| select.equals("보")) {
				return select;
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
}
