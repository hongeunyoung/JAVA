//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice37 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date[] dateList = new Date[5];
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + " ��° ��¥�� �Է��ϼ���.");
			
			System.out.print("�⵵: ");
			int y = s.nextInt();
			
			System.out.print("��: ");
			int m = s.nextInt();
			
			System.out.print("��: ");
			int d = s.nextInt();
			
			dateList[i] = new Date(y, m, d);
		}
		
		s.close();
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + "��° ��¥��" + dateList[i].getYear() + "�� " + dateList[i].getMonth() + "�� " +dateList[i].getDay() + "���Դϴ�.");
		}
	}
}
