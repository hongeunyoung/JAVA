//���ǰ����а� 20170809 ȫ����

public class Practice34 {
	public static void main(String[] args) {
		Student p1 = new Student("ȫ�浿", 20111234, "��ǻ����");
		Student p2 = new Student("������", 20121357, "������");
		Student p3 = new Student("������", 20121357, "������");
		Student p4 = p1;
		
		System.out.println("��ü p1�� ����");
		System.out.println(p1.printSafely());
		System.out.println();
		
		System.out.println("��ü p2�� ����");
		System.out.println(p2.printSafely());
		System.out.println();
		
		System.out.println("��ü p3�� ����");
		System.out.println(p3.printSafely());
		System.out.println();
		
		System.out.println("��ü p4�� ����");
		System.out.println(p4.printSafely());
		System.out.println();
		
		printInfo(p1, p2);
		printInfo(p2, p2);
		printInfo(p2, p3);
		printInfo(p1, p4);
	}
	
	public static void printInfo(Student sa, Student sb) {
		if(sa == sb) {
			System.out.println("���� ��ü");
		}
		else if(sa.isTheSame(sb)) {
			System.out.println("�ٸ� ��ü/���� �й�");
		}
		else {
			System.out.println("�ٸ� ��ü/�ٸ� �й�");
		}
	}
}
