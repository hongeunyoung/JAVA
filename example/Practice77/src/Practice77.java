//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice77 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Circle c1 = new Circle();
		System.out.println("첫번째 원 c1의 정보입니다.");
		System.out.println(c1.toString());
		
		System.out.println();
		
		System.out.println("두번째 원 c2의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		int x2 = s.nextInt();
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		int y2 = s.nextInt();
		System.out.print("반지름 값을 입력하세요: ");
		int r2 = s.nextInt();
		
		System.out.println();
		
		Circle c2 = new Circle(x2, y2, r2);
		System.out.println("두번째 원 c2의 정보입니다.");
		System.out.println(c2.toString());
		
		System.out.println();
		
		Point p1 = new Point();
		p1.setX(60);
		p1.setY(70);
		Circle c3 = new Circle(p1, 80);
		System.out.println("세번째 원 c3의 정보입니다.");
		System.out.println(c3.toString());
		
		Point p2 = new Point();
		System.out.println("\n네번째 원 c4의 정보를 입력 받습니다.");
		System.out.print("중심좌표의 X값을 입력하세요: ");
		p2.setX(s.nextInt());
		System.out.print("중심좌표의 Y값을 입력하세요: ");
		p2.setY(s.nextInt());
		System.out.print("반지름 값을 입력하세요: ");
		int r4 = s.nextInt();
		
		Circle c4 = new Circle(p2, r4);
		System.out.println("\n네번째 원 c4의 정보입니다.");
		System.out.println(c4.toString());
		
		System.out.println("\n첫번째 원 c1의 정보입니다.");
		System.out.println(c1.toString());
		
		System.out.println("\n두번째 원 c2의 정보입니다.");
		System.out.println(c2.toString());
		
		System.out.println("\n세번째 원 c3의 정보입니다.");
		System.out.println(c3.toString());
		
		System.out.println("\n네번째 원 c4의 정보입니다.");
		System.out.println(c4.toString());
		
		s.close();
	}
}
