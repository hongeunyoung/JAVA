import java.util.Scanner;

//보건관리학과 20170809 홍은영

public class Practice50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("도형의 X좌표를 입력하세요: ");
		s.setX(sc.nextInt());
		System.out.print("도형의 Y좌표를 입력하세요: ");
		s.setY(sc.nextInt());
		
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
		
		System.out.println("\n입력된 도형의 정보입니다.");
		System.out.println(s.toString());
		System.out.println("-- 이동 후 --");
		s.move();
		System.out.println(s.toString());
		
		System.out.println("\n입력된 사각형의 정보입니다.");
		r.draw();
		System.out.println("-- 이동 후 --");
		r.move();
		r.draw();
		
		System.out.println("\n입력된 삼각형의 정보입니다.");
		t.draw();
		System.out.println("-- 이동 후 --");
		t.move();
		t.draw();
	}
}
