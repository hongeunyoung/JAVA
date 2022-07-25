//보건관리학과 20170809 홍은영

public class Practice30 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("김동덕");
		student1.setAge(22);
		student1.setAddress("서울시");
		student1.setSid(20132468);
		student1.setMajor("컴퓨터학");
		
		Student student2 = new Student("홍길동");
		student2.setAge(30);
		student2.setAddress("제주시");
		student2.setSid(20111234);
		student2.setMajor("컴퓨터학");
		
		Student student3 = new Student("성춘향", 20121357, "국문학");
		student3.setAge(16);
		student3.setAddress("남원시");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		System.out.println(student1.printSafely());
		System.out.println(student2.printSafely());
		System.out.println(student3.printSafely());
	}
}
