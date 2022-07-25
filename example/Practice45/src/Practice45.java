//보건관리학과 20170809 홍은영

public class Practice45 {
	public static void main(String[] args) {
		Student s1 = new Student(1111, 100, 3.2);
		UndergraduateStudent s2 = new UndergraduateStudent(2222, 100, 4.1, 3);
		GraduateStudent s3 = new GraduateStudent(3333, 100, 3.4, "SE");
		
		//정보를 출력
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
