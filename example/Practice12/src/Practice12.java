//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		while(num <= 0)
		{
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			System.out.print("������ �Է��ϼ���: ");
			num = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
			}
			
			if(count % 7 == 0) {
				System.out.println();
			}
		}
	}
}
