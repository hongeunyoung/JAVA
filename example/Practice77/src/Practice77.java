//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice77 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Circle c1 = new Circle();
		System.out.println("ù��° �� c1�� �����Դϴ�.");
		System.out.println(c1.toString());
		
		System.out.println();
		
		System.out.println("�ι�° �� c2�� ������ �Է� �޽��ϴ�.");
		System.out.print("�߽���ǥ�� X���� �Է��ϼ���: ");
		int x2 = s.nextInt();
		System.out.print("�߽���ǥ�� Y���� �Է��ϼ���: ");
		int y2 = s.nextInt();
		System.out.print("������ ���� �Է��ϼ���: ");
		int r2 = s.nextInt();
		
		System.out.println();
		
		Circle c2 = new Circle(x2, y2, r2);
		System.out.println("�ι�° �� c2�� �����Դϴ�.");
		System.out.println(c2.toString());
		
		System.out.println();
		
		Point p1 = new Point();
		p1.setX(60);
		p1.setY(70);
		Circle c3 = new Circle(p1, 80);
		System.out.println("����° �� c3�� �����Դϴ�.");
		System.out.println(c3.toString());
		
		Point p2 = new Point();
		System.out.println("\n�׹�° �� c4�� ������ �Է� �޽��ϴ�.");
		System.out.print("�߽���ǥ�� X���� �Է��ϼ���: ");
		p2.setX(s.nextInt());
		System.out.print("�߽���ǥ�� Y���� �Է��ϼ���: ");
		p2.setY(s.nextInt());
		System.out.print("������ ���� �Է��ϼ���: ");
		int r4 = s.nextInt();
		
		Circle c4 = new Circle(p2, r4);
		System.out.println("\n�׹�° �� c4�� �����Դϴ�.");
		System.out.println(c4.toString());
		
		System.out.println("\nù��° �� c1�� �����Դϴ�.");
		System.out.println(c1.toString());
		
		System.out.println("\n�ι�° �� c2�� �����Դϴ�.");
		System.out.println(c2.toString());
		
		System.out.println("\n����° �� c3�� �����Դϴ�.");
		System.out.println(c3.toString());
		
		System.out.println("\n�׹�° �� c4�� �����Դϴ�.");
		System.out.println(c4.toString());
		
		s.close();
	}
}
