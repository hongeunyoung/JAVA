//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, total = 0, count = 0;
		double average = 0;
		
		do{
			System.out.print("���ڸ� �Է��ϼ���: ");
			i = sc.nextInt();
			
			if(i > 0) {
				total += i;
				count += 1;
			}
			else if(i < 0) {
				System.out.println("������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		} while(i != 0);
		
		System.out.println("�Էµ� ���ڵ��� ���� " + total + "�Դϴ�.");
		System.out.println("�Էµ� ���ڵ� �߿��� 0���� ū ������ ������ " + count + "�Դϴ�.");

		average = (double)total / count;
		System.out.println("�Էµ� ���ڵ��� ����� " + average + "�Դϴ�.");
		
		sc.close();
	}

}
