//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		s.setX(sc.nextInt());
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		s.setY(sc.nextInt());
		
		System.out.print("\n�簢���� X��ǥ�� �Է��ϼ���: ");
		r.setX(sc.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		r.setY(sc.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setLength(sc.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setWidth(sc.nextInt());
		
		System.out.print("\n�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		t.setX(sc.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		t.setY(sc.nextInt());
		System.out.print("�ﰢ���� ���θ� �Է��ϼ���: ");
		t.setBase(sc.nextInt());
		System.out.print("�ﰢ���� ���θ� �Է��ϼ���: ");
		t.setHeight(sc.nextInt());
		
		sc.close();
		
		System.out.println("\n�Էµ� ������ �����Դϴ�.");
		System.out.println(s.toString());
		System.out.println("-- �̵� �� --");
		s.move();
		System.out.println(s.toString());
		
		System.out.println("\n�Էµ� �簢���� �����Դϴ�.");
		System.out.println(r.toString());
		System.out.println("-- �̵� �� --");
		r.move();
		System.out.println(r.toString());
		
		System.out.println("\n�Էµ� �ﰢ���� �����Դϴ�.");
		System.out.println(t.toString());
		System.out.println("-- �̵� �� --");
		t.move();
		System.out.println(t.toString());
	}
}