//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, total = 0;
		
		do{
			System.out.print("���ڸ� �Է��ϼ���: ");
			i = sc.nextInt();
			
			if(i > 0) {
				total += i;
			}
			else if(i < 0) {
				System.out.println("������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���.");
			}
		} while(i != 0);
		
		System.out.println("�Էµ� ���ڵ��� ���� " + total + "�Դϴ�.");
		
		sc.close();
	}
}
