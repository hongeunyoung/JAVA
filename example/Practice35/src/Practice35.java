//���ǰ����а� 20170809 ȫ����

public class Practice35 {
	public static void main(String[] args) {
		Date date1 = new Date();
		date1.setYear(2007);
		date1.setMonth(2);
		date1.setDay(18);
		
		Date date2 = new Date(2006);
		date2.setMonth(3);
		date2.setDay(2);
		
		Date date3 = new Date(2007, 2);
		date3.setDay(27);
		
		Date date4 = new Date(2007, 3, 2);
		
		Date date5 = new Date(2007, 4);
		date5.setDay(20);
		
		Date date6 = new Date(2007, 4, 26);
		
		System.out.println("������ " + date1.toString() + "�Դϴ�.");
		System.out.println("���� �������ڴ��б��� ������ ��¥�� " + date2.toString() + "�Դϴ�.");
		System.out.println("2007�г⵵ �������� " + date3.toString() + "���� " + date4.toString() + "�� ����Ǿ����ϴ�.");
		System.out.println("�߰���� �Ⱓ�� " + date5.toString() + "���� " + date6.toString() + "���� �Դϴ�.");
	}
}
