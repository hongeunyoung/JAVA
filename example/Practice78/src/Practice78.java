//���ǰ����а� 20170809 ȫ����

public class Practice78 {
	public static void main(String[] args) {
		//1
		Movie m1 = new Movie();
		
		System.out.println("ù ��° ��ȭ�� �����Դϴ�.");
		System.out.println(m1.toString());
		
		//2
		Date d1 = new Date(2010, 7, 25);
		Movie m2 = new Movie("�μ���", "�", d1);
		
		System.out.println("�� ��° ��ȭ�� �����Դϴ�.");
		System.out.println(m2.toString());
		
		//3
		Movie m3 = new Movie("���� ���߾�", "��ó�� ĿƼ��");
		//1�� ���:  viewDay�� ���� ���������� ���ͼ� �� ������ ����
		Date dTmp = m3.getViewDay();
		dTmp.setYear(2015);
		dTmp.setMonth(12);
		dTmp.setDay(24);
		/*2�� ���: ���ο� ������ ��� �ִ� ������ ��ü ���� �� ��ȯ
		Date d2 = new Date(2015, 12, 24);
		m3.setViewDay(d2);
		*/
		
		System.out.println("�� ��° ��ȭ�� �����Դϴ�.");
		System.out.println(m3.toString());
	}
}
