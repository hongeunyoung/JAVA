//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		while(num <= 0)
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
		}
		
		sc.close();
		
		if(num == 1) {
			isPrime = false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("�Էµ� ���� " + num + "�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Էµ� ���� " + num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}

}
