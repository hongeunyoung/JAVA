//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date[] dateList = new Date[5];
		
		for(int i = 0; i < dateList.length; i++) {
			dateList[i] = new Date();
		}
		
		Date earlist = dateList[0];
		int earlistIndex = 1;
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + "��° ��¥�� �Է��ϼ���.");
			
			System.out.print("�⵵: ");
			dateList[i].setYear(s.nextInt());
			
			System.out.print("��: ");
			dateList[i].setMonth(s.nextInt());
			
			System.out.print("��: ");
			dateList[i].setDay(s.nextInt());
			
			if(Date.compareDate(earlist, dateList[i]) == 1) {
				earlist = dateList[i];
				earlistIndex = (i + 1);
			}
		}
		
		s.close();
		
		System.out.println("���� ���� ��¥�� " + earlistIndex + "��° �Էµ� " + earlist.toString() + "�Դϴ�.");
	}
}
