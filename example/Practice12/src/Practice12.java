//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		while(num <= 0)
		{
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			System.out.print("정수를 입력하세요: ");
			num = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
			}
			
			if(count % 7 == 0) {
				System.out.println();
			}
		}
	}
}
