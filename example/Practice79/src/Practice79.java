//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice79 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Է��� ���ϴ� ��ȭ�� ����� �Է��ϼ���: ");
		int num = s.nextInt();
		
		Movie[] m = new Movie[num];
		
		for(int i = 0; i < num; i++) {
			m[i] = new Movie();
		}
		
		Movie fast = m[0];
		
		for(int i = 0; i < num; i++) {			
			System.out.println((i + 1) + "�� ��ȭ������ �Է��ϼ���.");
			
			System.out.print("��ȭ������? ");
			m[i].setTitle(s.next());
			
			System.out.print("������? ");
			m[i].setDirector(s.next());
			
			System.out.print("���� �⵵��? ");
			m[i].getViewDay().setYear(s.nextInt());
			
			System.out.print("���� ����? ");
			m[i].getViewDay().setMonth(s.nextInt());
			
			System.out.print("���� ����? ");
			m[i].getViewDay().setDay(s.nextInt());;
			
			if(i > 0) {
				if(m[i - 1].getViewDay().getYear() > m[i].getViewDay().getYear()) {
					fast = m[i];
				}
				else if(m[i - 1].getViewDay().getYear() == m[i].getViewDay().getYear()) {
					if(m[i - 1].getViewDay().getMonth() > m[i].getViewDay().getMonth()) {
						fast = m[i];
					}
					else if(m[i - 1].getViewDay().getMonth() == m[i].getViewDay().getMonth()) {
						if(m[i - 1].getViewDay().getDay() > m[i].getViewDay().getDay()) {
							fast = m[i];
						}
					}
				}
			}
		}
		
		System.out.println("�Էµ� ��ȭ �����Դϴ�.");
		
		for(int i = 0; i < num; i++) {
			System.out.println(m[i].printOneLine());
		}
		
		System.out.println("�������� ���� ���� ��ȭ�� \"" + fast.getTitle() + "\"�Դϴ�.");
		
		s.close();
	}
}
