//���ǰ����а� 20170809 ȫ����

public class Person {
	private String name;
	private int age;
	private String address;
	
	public String getName() { return name;}
	public void setName(String name) { this.name = name;}
	
	public int getAge() { return age;}
	public void setAge(int age) { this.age = age;}
	
	public String getAddress() { return address;}
	public void setAddress(String address) { this.address = address;}
	
	Person() {
		this("��", -1, "��");
	}
	
	Person(String name) {
		this(name, -1, "��");
	}
	
	Person(String name, int age) {
		this(name, age, "��");
	}
	
	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String toString() {
		String rslt ="";
		
		rslt += "�̸�: " + getName() + ", ";
		rslt += "����: " + getAge() + "��, ";
		rslt += "�ּ�: " + getAddress();
		
		return rslt;
	}
}
