//���ǰ����а� 20170809 ȫ����

public class Practice30 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("�赿��");
		student1.setAge(22);
		student1.setAddress("�����");
		student1.setSid(20132468);
		student1.setMajor("��ǻ����");
		
		Student student2 = new Student("ȫ�浿");
		student2.setAge(30);
		student2.setAddress("���ֽ�");
		student2.setSid(20111234);
		student2.setMajor("��ǻ����");
		
		Student student3 = new Student("������", 20121357, "������");
		student3.setAge(16);
		student3.setAddress("������");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		System.out.println(student1.printSafely());
		System.out.println(student2.printSafely());
		System.out.println(student3.printSafely());
	}
}
