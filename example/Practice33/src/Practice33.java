//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("사각형1의 가로를 입력: ");
		int width1 = sc.nextInt();
		
		System.out.print("사각형1의 세로를 입력: ");
		int height1 = sc.nextInt();
		
		System.out.print("사각형2의 가로를 입력: ");
		int width2 = sc.nextInt();
		
		System.out.print("사각형2의 세로를 입력: ");
		int height2 = sc.nextInt();
		
		s1 = Square.getInstance(width1, height1);
		s2 = Square.getInstance(width2, height2);
		
		sc.close();
		
		if(s1.isSmallerThan(s2)) {
			System.out.println("사각형1의 넓이가 더 작습니다.");
		}
		else {
			if(s2.isSmallerThan(s1) == false) {
				System.out.println("두 사각형의 넓이가 같습니다.");
			}
			else {
				System.out.println("사각형2의 넓이가 더 작습니다.");
			}
		}
			
	}
}
