//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л� ���ڸ� �Է��ϼ���: ");
		int num = s.nextInt();
		
		Student[] student = new Student[num];
		
		for(int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "�� �л��� ����");
			
			System.out.print("�̸�: ");
			String name = s.next();
			
			System.out.print("�й�: ");
			int id = s.nextInt();
			
			System.out.print("����: ");
			String major = s.next();
			
			student[i] = new Student(name, id, major);
		}
		
		s.close();
		
		System.out.println("�Էµ� �л��� �����Դϴ�.");
		
		for(int i = 0; i < student.length; i++) {
			System.out.println("[" + (i + 1) + "] �̸�: " + student[i].getName() + ", �й�: " + student[i].getSid() + ", ����: " + student[i].getMajor());
		}
		
		System.out.println();
		
		for(int i = 1; i < student.length; i++) {
			System.out.print("\"" + student[0].getName() + "\" �л��� \"" + student[i].getName() + "\" �л��� ");
			if(student[0].equlasMajor(student[i])) {
				System.out.print("������ ����, ");
				
				if(student[0].isSenior(student[i]) == 0) {
					System.out.println("�й��� �����ϴ�.");
				}
			}
			else {
				System.out.print("������ �ٸ���, ");
				
				if(student[0].isSenior(student[i]) == 0) {
					System.out.println("�й��� �����ϴ�.");
				}
			}
			
			if(student[0].isSenior(student[i]) == -1) {
				System.out.println("�й��� �����ϴ�.");
			}
			else if(student[0].isSenior(student[i]) == 1) {
				System.out.println("�й��� �����ϴ�.");
			}
		}
	}
}
