//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Pratice53 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape s[] = new Shape[3];
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		int sx = sc.nextInt();
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		int sy = sc.nextInt();
		
		System.out.print("\n�簢���� X��ǥ�� �Է��ϼ���: ");
		int rx = sc.nextInt();
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		int ry = sc.nextInt();
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		int rl = sc.nextInt();
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		int rw = sc.nextInt();
		
		System.out.print("\n�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		int tx = sc.nextInt();
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		int ty = sc.nextInt();;
		System.out.print("�ﰢ���� ���θ� �Է��ϼ���: ");
		int tb = sc.nextInt();
		System.out.print("�ﰢ���� ���θ� �Է��ϼ���: ");
		int th = sc.nextInt();
		
		sc.close();
		
		s[0] = new Shape(sx, sy);
		s[1] = new Rectangle(rx, ry, rl, rw);
		s[2] = new Triangle(tx, ty, tb, th);
		
		System.out.println("\n�Էµ� �����Դϴ�.\n");
		
		for(int i = 0; i < s.length; i++) {
			System.out.print((i + 1) + ": ");
			System.out.println(s[i].toString());
		}
		
		System.out.println("\n-- �������� �̵��մϴ� --\n");
		
		for(int i = 0; i < s.length; i++) {
			s[i].move();
			System.out.print((i + 1) + ": ");
			System.out.println(s[i].toString());
		}
	}
}
