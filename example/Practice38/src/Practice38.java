//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date date1 = new Date();
		
		System.out.println("ù ��° ��¥�� �Է��ϼ���.");
		
		System.out.print("�⵵: ");
		date1.setYear(s.nextInt());
		
		System.out.print("��: ");
		date1.setMonth(s.nextInt());
		
		System.out.print("��: ");
		date1.setDay(s.nextInt());
		
		Date date2 = new Date();
		
		System.out.println("�� ��° ��¥�� �Է��ϼ���.");
		
		System.out.print("�⵵: ");
		date2.setYear(s.nextInt());
		
		System.out.print("��: ");
		date2.setMonth(s.nextInt());
		
		System.out.print("��: ");
		date2.setDay(s.nextInt());
		
		s.close();
		
		if(Date.compareDate(date1, date2) == -1) {
			System.out.println("ù ��° ��¥�� " + date1.toString() + "�� �̸� ��¥�Դϴ�.");
		}
		else if(Date.compareDate(date1, date2) == 1) {
			System.out.println("�� ��° ��¥�� " + date2.toString() + "�� �̸� ��¥�Դϴ�.");
		}
		else {
			System.out.println("�� ��¥�� ���� ��¥�Դϴ�.");
		}
	}
}
