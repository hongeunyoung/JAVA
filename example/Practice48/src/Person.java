//���ǰ����а� 20170809 ȫ����

public class Person implements Speakable {
	String name;
	int age;
	
	public void speak() {
		if(age >= 2) {
			System.out.println("�ȳ�");
		}
		else {
			System.out.println("����");
		}
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
