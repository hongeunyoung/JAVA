//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("�Է��� ���� " + number + "�� �����Դϴ�.");
		}
		else {
			if(number % 2 == 0) {
				System.out.println("�Է��� ���� " + number + "�� ¦���Դϴ�.");
			}
			else {
				System.out.println("�Է��� ���� " + number + "�� Ȧ���Դϴ�.");
			}
		}
		
		sc.close();
	}
}