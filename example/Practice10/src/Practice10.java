//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, total = 0, count = 0;
		double average = 0;
		
		do{
			System.out.print("숫자를 입력하세요: ");
			i = sc.nextInt();
			
			if(i > 0) {
				total += i;
				count += 1;
			}
			else if(i < 0) {
				System.out.println("음수가 입력되었습니다. 다시 입력하세요.");
			}
		} while(i != 0);
		
		System.out.println("입력된 숫자들의 합은 " + total + "입니다.");
		System.out.println("입력된 숫자들 중에서 0보다 큰 숫자의 개수는 " + count + "입니다.");

		average = (double)total / count;
		System.out.println("입력된 숫자들의 평균은 " + average + "입니다.");
		
		sc.close();
	}

}
