//보건관리학과 20170809 홍은영

public class Person implements Speakable {
	String name;
	int age;
	
	public void speak() {
		if(age >= 2) {
			System.out.println("안녕");
		}
		else {
			System.out.println("응애");
		}
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
