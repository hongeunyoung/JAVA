//���ǰ����а� 20170809 ȫ����

public class Practice40 {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 20111234, "��ǻ����");
		Student s2 = new Student("������", 20121357, "������");
		Student s3 = new Student("�̸���", 20101357, "��ǻ����");
		
		System.out.print("\"" + s1.getName() + "\" �л��� \"" + s2.getName() + "\" �л��� ");
		if(s1.equlasMajor(s2)) {
			System.out.print("������ ����, ");
			
			if(s1.isSenior(s2) == 0) {
				System.out.println("�й��� �����ϴ�.");
			}
		}
		else {
			System.out.print("������ �ٸ���, ");
			
			if(s1.isSenior(s2) == 0) {
				System.out.println("�й��� �����ϴ�.");
			}
		}
		
		if(s1.isSenior(s2) == -1) {
			System.out.println("�й��� �����ϴ�.");
		}
		else if(s1.isSenior(s2) == 1) {
			System.out.println("�й��� �����ϴ�.");
		}
		
		System.out.print("\"" + s1.getName() + "\" �л��� \"" + s3.getName() + "\" �л��� ");
		if(s1.equlasMajor(s3)) {
			System.out.print("������ ����, ");
			
			if(s1.isSenior(s3) == 0) {
				System.out.println("�й��� �����ϴ�.");
			}
		}
		else {
			System.out.print("������ �ٸ���, ");
			
			if(s1.isSenior(s3) == 0) {
				System.out.println("�й��� �����ϴ�.");
			}
		}
		
		if(s1.isSenior(s3) == -1) {
			System.out.println("�й��� �����ϴ�.");
		}
		else if(s1.isSenior(s3) == 1) {
			System.out.println("�й��� �����ϴ�.");
		}
	}
}
