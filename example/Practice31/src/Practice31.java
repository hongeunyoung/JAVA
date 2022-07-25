//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BodyData i = new BodyData();
		BodyData you = new BodyData();
		
		System.out.print("내 키를 입력하세요: ");
		i.getHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요: ");
		i.getWeight(sc.nextInt());
		
		System.out.print("당신의 키를 입력하세요: ");
		you.getHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요: ");
		you.getWeight(sc.nextInt());
		
		sc.close();
		
		if(i.isTallerThan(you)) {
			if(you.isTallerThan(i)) {
				System.out.println("나와 당신의 키는 같습니다.");
			}
			else {
				System.out.println("키는 내가 더 큽니다.");
			}
		}
		else {
			System.out.println("키는 당신이 더 큽니다.");
		}
		
		if(i.needDiet()) {
			System.out.println("나는 다이어트가 필요합니다.");
		}
		else {
			System.out.println("나는 다이어트가 필요하지 않습니다.");
		}
		
		if(you.needDiet()) {
			System.out.println("당신은 다이어트가 필요합니다.");
		}
		else {
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
		}
	}
}
