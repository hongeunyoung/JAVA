//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice70 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ RandomList�� �����մϴ�.");
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		int size1 = s.nextInt();
		
		RandomList<Integer> list1 = new RandomList<Integer>();

		for(int i = 0; i < size1; i++) {
			System.out.print("�߰��ϰ� ���� ������ �Է��ϼ���: ");
			list1.add(s.nextInt());
		}
		
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		list1.print();
		System.out.println("������ ���� ���: " + list1.select());
		
		System.out.println();
		
		System.out.println("���ڿ� RandomList�� �����մϴ�.");
		System.out.print("����Ʈ�� ũ�⸦ �Է��ϼ���: ");
		int size2 = s.nextInt();
		
		RandomList<String> list2 = new RandomList<String>();

		for(int i = 0; i < size2; i++) {
			System.out.print("�߰��ϰ� ���� ���ڿ��� �Է��ϼ���: ");
			list2.add(s.next());
		}
		
		s.close();
		
		System.out.println("����Ʈ�� ������ ����մϴ�.");
		list2.print();
		System.out.println("������ ���� ���: " + list2.select());
	}
}
