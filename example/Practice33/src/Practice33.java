//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("�簢��1�� ���θ� �Է�: ");
		int width1 = sc.nextInt();
		
		System.out.print("�簢��1�� ���θ� �Է�: ");
		int height1 = sc.nextInt();
		
		System.out.print("�簢��2�� ���θ� �Է�: ");
		int width2 = sc.nextInt();
		
		System.out.print("�簢��2�� ���θ� �Է�: ");
		int height2 = sc.nextInt();
		
		s1 = Square.getInstance(width1, height1);
		s2 = Square.getInstance(width2, height2);
		
		sc.close();
		
		if(s1.isSmallerThan(s2)) {
			System.out.println("�簢��1�� ���̰� �� �۽��ϴ�.");
		}
		else {
			if(s2.isSmallerThan(s1) == false) {
				System.out.println("�� �簢���� ���̰� �����ϴ�.");
			}
			else {
				System.out.println("�簢��2�� ���̰� �� �۽��ϴ�.");
			}
		}
			
	}
}
