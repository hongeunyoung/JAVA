//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		while(num <= 0)
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
		}
		
		sc.close();
		
		if(num == 1) {
			isPrime = false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("입력된 숫자 " + num + "은 소수입니다.");
		}
		else {
			System.out.println("입력된 숫자 " + num + "은 소수가 아닙니다.");
		}
	}

}
