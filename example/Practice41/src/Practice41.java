//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생 숫자를 입력하세요: ");
		int num = s.nextInt();
		
		Student[] student = new Student[num];
		
		for(int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번 학생의 정보");
			
			System.out.print("이름: ");
			String name = s.next();
			
			System.out.print("학번: ");
			int id = s.nextInt();
			
			System.out.print("전공: ");
			String major = s.next();
			
			student[i] = new Student(name, id, major);
		}
		
		s.close();
		
		System.out.println("입력된 학생의 정보입니다.");
		
		for(int i = 0; i < student.length; i++) {
			System.out.println("[" + (i + 1) + "] 이름: " + student[i].getName() + ", 학번: " + student[i].getSid() + ", 전공: " + student[i].getMajor());
		}
		
		System.out.println();
		
		for(int i = 1; i < student.length; i++) {
			System.out.print("\"" + student[0].getName() + "\" 학생은 \"" + student[i].getName() + "\" 학생과 ");
			if(student[0].equlasMajor(student[i])) {
				System.out.print("전공은 같고, ");
				
				if(student[0].isSenior(student[i]) == 0) {
					System.out.println("학번도 같습니다.");
				}
			}
			else {
				System.out.print("전공은 다르고, ");
				
				if(student[0].isSenior(student[i]) == 0) {
					System.out.println("학번은 같습니다.");
				}
			}
			
			if(student[0].isSenior(student[i]) == -1) {
				System.out.println("학번은 빠릅니다.");
			}
			else if(student[0].isSenior(student[i]) == 1) {
				System.out.println("학번은 느립니다.");
			}
		}
	}
}
