//���ǰ����а� 20170809 ȫ����

public class Practice29 {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("�赿��");
		person1.setAge(22);
		person1.setAddress("�����");
		
		System.out.println(person1.toString());
		
		Person person2 = new Person("ȫ�浿", 30);
		person2.setAddress("���ֽ�");
		
		System.out.println(person2.toString());
		
		Person person3 = new Person("������", 16, "������");
		
		System.out.println(person3.toString());
	}
}
