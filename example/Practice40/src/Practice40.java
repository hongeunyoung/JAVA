//보건관리학과 20170809 홍은영

public class Practice40 {
	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 20111234, "컴퓨터학");
		Student s2 = new Student("성춘향", 20121357, "국문학");
		Student s3 = new Student("이몽룡", 20101357, "컴퓨터학");
		
		System.out.print("\"" + s1.getName() + "\" 학생은 \"" + s2.getName() + "\" 학생과 ");
		if(s1.equlasMajor(s2)) {
			System.out.print("전공은 같고, ");
			
			if(s1.isSenior(s2) == 0) {
				System.out.println("학번도 같습니다.");
			}
		}
		else {
			System.out.print("전공은 다르고, ");
			
			if(s1.isSenior(s2) == 0) {
				System.out.println("학번은 같습니다.");
			}
		}
		
		if(s1.isSenior(s2) == -1) {
			System.out.println("학번은 빠릅니다.");
		}
		else if(s1.isSenior(s2) == 1) {
			System.out.println("학번은 느립니다.");
		}
		
		System.out.print("\"" + s1.getName() + "\" 학생은 \"" + s3.getName() + "\" 학생과 ");
		if(s1.equlasMajor(s3)) {
			System.out.print("전공은 같고, ");
			
			if(s1.isSenior(s3) == 0) {
				System.out.println("학번도 같습니다.");
			}
		}
		else {
			System.out.print("전공은 다르고, ");
			
			if(s1.isSenior(s3) == 0) {
				System.out.println("학번은 같습니다.");
			}
		}
		
		if(s1.isSenior(s3) == -1) {
			System.out.println("학번은 빠릅니다.");
		}
		else if(s1.isSenior(s3) == 1) {
			System.out.println("학번은 느립니다.");
		}
	}
}
