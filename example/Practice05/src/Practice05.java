//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.println("�Է��� ���� " + number + "�� ���밪�� " + -number + ("�Դϴ�."));
		}
		else {
			System.out.println("�Է��� ���� " + number + "�� ���밪�� " + number + ("�Դϴ�."));
		}
		
		sc.close();
	}
}
