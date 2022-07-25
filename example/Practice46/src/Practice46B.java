//보건관리학과 20170809 홍은영

public class Practice46B {
	public static void main(String[] args) {
		Student[] s = new Student[3];
		
		s[0] = new Student();
		s[1] = new UndergraduateStudent();
		s[2] = new GraduateStudent();
		
		s[0].setId(1111);
		s[0].setTuition(100);
		s[0].setGpa(3.2);
		
		s[1].setId(2222);
		s[1].setTuition(100);
		s[1].setGpa(4.1);
		((UndergraduateStudent)s[1]).setYear(3);
		
		s[2].setId(3333);
		s[2].setTuition(100);
		s[2].setGpa(3.4);
		((GraduateStudent)s[2]).setLab("SE");
		
		printAll(s);
	}
	
	public static void printAll(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
}
