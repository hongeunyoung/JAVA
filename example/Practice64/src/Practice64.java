//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice64 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//�ϴ�
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		MyBox<String> m1 = new MyBox<String>(s.next());
		
		System.out.println("MyBox�� ����� ����: " + m1.get());
		
		//�ٴ�
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		m1.set(s.next());
		
		System.out.println("MyBox�� ����� ����: " + m1.get());
		
		//123
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		Integer i1 = s.nextInt();
		
		MyBox<Integer> m2 = new MyBox<Integer>(i1);
		
		//456
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		Integer i2 = s.nextInt();
		
		MyBox<Integer> m3 = new MyBox<Integer>(i2);
		
		//m2 + m3
		System.out.println(m2.get() + " + " + m3.get() + " = " + (m2.get() + m3.get()));
		
		s.close();
	}
}
