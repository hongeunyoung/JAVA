//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도를 입력하세요: ");
		int fahrenheit = sc.nextInt();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("해당하는 섭씨 온도는 " + celsius + "입니다.");
		
		sc.close();
	}
}
