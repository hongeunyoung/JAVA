//보건관리학과 20170809 홍은영

public class Practice46A {
	public static void main(String[] args) {
		Student s1 = new Student(1111, 100, 3.2);
		UndergraduateStudent s2 = new UndergraduateStudent(2222, 100, 4.1, 3);
		GraduateStudent s3 = new GraduateStudent(3333, 100, 3.4, "SE");
		
		Student[] s = new Student[3];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		
		printAll(s);
	}

	public static void printAll(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
}
