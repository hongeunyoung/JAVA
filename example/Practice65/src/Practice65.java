//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice65 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���ڿ��� �̷���� �������� ����ϴ�.");
		System.out.print("ù��° ���Ҹ� �Է��ϼ���: ");
		String s1 = s.next();
		System.out.print("�ι�° ���Ҹ� �Է��ϼ���: ");
		String s2 = s.next();
		
		MyPair<String> m1 = new MyPair<String>(s1, s2);
		
		System.out.println("������� ������: " + m1.toString() + "\n");
		
		System.out.println("���ڷ� �̷���� �������� ����ϴ�.");
		System.out.print("ù��° ���Ҹ� �Է��ϼ���: ");
		int n1 = s.nextInt();
		System.out.print("�ι�° ���Ҹ� �Է��ϼ���: ");
		int n2 = s.nextInt();
		
		MyPair<Integer> m2 = new MyPair<Integer>(n1, n2);
		
		System.out.println("������� ������: " + m2.toString());
		
		s.close();		
	}
}
