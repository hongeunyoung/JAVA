//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice67 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] sArray = {"�ϳ�", "�ο�", "����"};
		Integer[] iArray = {10, 20, 30, 40};
		
		System.out.println("���ڿ� �迭�� �����Դϴ�.");
		MyArray.<String>displayArray(sArray);
		
		int index;
		for(int i = 0; i < 2; i++) {
			System.out.print("���ڿ� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
			index = s.nextInt();
			
			System.out.print(index + "�� �ε��� ���� ���� : ");
			
			try { 
				System.out.println(MyArray.pickNew(sArray, index));
			} catch (OutOfRange e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.print("\n0�� �ε����� ����� ���� ��ȯ�ϰ� ���� �ε����� �����ϼ���: ");
		MyArray.swap(sArray, 0, s.nextInt());
		System.out.println("���� �� ���ڿ� �迭");
		MyArray.displayArray(sArray);
		
		System.out.println("������ �迭�� �����Դϴ�.");
		MyArray.<Integer>displayArray(iArray);
		
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			System.out.print("���� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
			index = s.nextInt();
			
			System.out.print(index + "�� �ε��� ���� ���� : ");
			
			try { 
				System.out.println(MyArray.pickNew(iArray, index));
			} catch (OutOfRange e) {
				System.out.println(e.getMessage());
			}
		}
		
		s.close();
	}
}
