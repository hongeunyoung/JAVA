//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Pratice53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s[] = new Shape[3];
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		int sx = sc.nextInt();
		System.out.print("도형의 Y좌표를 입력하세요: ");
		int sy = sc.nextInt();
		
		System.out.print("\n사각형의 X좌표를 입력하세요: ");
		int rx = sc.nextInt();
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		int ry = sc.nextInt();
		System.out.print("사각형의 가로를 입력하세요: ");
		int rl = sc.nextInt();
		System.out.print("사각형의 세로를 입력하세요: ");
		int rw = sc.nextInt();
		
		System.out.print("\n삼각형의 X좌표를 입력하세요: ");
		int tx = sc.nextInt();
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		int ty = sc.nextInt();;
		System.out.print("삼각형의 가로를 입력하세요: ");
		int tb = sc.nextInt();
		System.out.print("삼각형의 세로를 입력하세요: ");
		int th = sc.nextInt();
		
		sc.close();
		
		s[0] = new Shape(sx, sy);
		s[1] = new Rectangle(rx, ry, rl, rw);
		s[2] = new Triangle(tx, ty, tb, th);
		
		System.out.println("\n입력된 정보입니다.\n");
		
		for(int i = 0; i < s.length; i++) {
			System.out.print((i + 1) + ": ");
			System.out.println(s[i].toString());
		}
		
		System.out.println("\n-- 도형들을 이동합니다 --\n");
		
		for(int i = 0; i < s.length; i++) {
			s[i].move();
			System.out.print((i + 1) + ": ");
			System.out.println(s[i].toString());
		}
	}
}
