//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ġ ���� �Է��ϼ���: ");
		double inch = sc.nextDouble();
		int centimeter = (int)(2.54 * inch);
		System.out.println("�ش��ϴ� ��Ƽ���� ���� " + centimeter + "�Դϴ�.");

		sc.close();
	}

}
