//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setWidth(sc.nextInt());
		
		System.out.print("�簢��1�� ���θ� �Է�: ");
		s1.setHeight(sc.nextInt());
		
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setWidth(sc.nextInt());
		
		System.out.print("�簢��2�� ���θ� �Է�: ");
		s2.setHeight(sc.nextInt());
		
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
