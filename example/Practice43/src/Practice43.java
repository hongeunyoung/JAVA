import java.util.Scanner;

//보건관리학과 20170809 홍은영

public class Practice43 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		//Shape가 추상클래스가 되었기 때문에 객체 생성이 불가능하다.
		//Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		/*
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(sc.nextInt());
		*/
		
		System.out.print("\n사각형의 X좌표를 입력하세요: ");
		r.setX(sc.nextInt());
		System.out.print("사각형의 Y좌표를 입력하세요: ");
		r.setY(sc.nextInt());
		System.out.print("사각형의 가로를 입력하세요: ");
		r.setLength(sc.nextInt());
		System.out.print("사각형의 세로를 입력하세요: ");
		r.setWidth(sc.nextInt());
		
		System.out.print("\n삼각형의 X좌표를 입력하세요: ");
		t.setX(sc.nextInt());
		System.out.print("삼각형의 Y좌표를 입력하세요: ");
		t.setY(sc.nextInt());
		System.out.print("삼각형의 가로를 입력하세요: ");
		t.setBase(sc.nextInt());
		System.out.print("삼각형의 세로를 입력하세요: ");
		t.setHeight(sc.nextInt());
		
		sc.close();
		
		/*
		System.out.println("\n입력된 도형의 정보입니다.");
		System.out.println(s.toString());
		*/
		
		System.out.println("\n입력된 사각형의 정보입니다.");
		System.out.println(r.toString());
		
		System.out.println("\n입력된 삼각형의 정보입니다.");
		System.out.println(t.toString());
	}
}
