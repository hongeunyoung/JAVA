//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ�� �µ��� �Է��ϼ���: ");
		int fahrenheit = sc.nextInt();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("�ش��ϴ� ���� �µ��� " + celsius + "�Դϴ�.");
		
		sc.close();
	}
}
