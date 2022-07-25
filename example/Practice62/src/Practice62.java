//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice62 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BankAccount[] bank = new BankAccount[3];
		
		for(int i = 0; i < bank.length; i++) {
			bank[i] = new BankAccount();
			
			System.out.print("������ �̸��� �Է��ϼ���: ");
			bank[i].setOwner(s.next());
			
			System.out.print("�ܰ� �Է��ϼ���: ");
			bank[i].setBalance(s.nextInt());
		}
		
		boolean correct = false;
		do {
			printBank(bank);
			
			System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ��� (����-0): ");
			int bankNum = s.nextInt();
			
			if(bankNum == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				correct = true;
			}
			else {
				System.out.print("���ϴ� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
				int work = s.nextInt();
				
				if(work == 1) {
					System.out.print("�Աݾ��� �Է��ϼ���: ");
					bank[(bankNum - 1)].deposit(s.nextInt());
					
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				}
				else {
					try {
						System.out.print("��ݾ��� �Է��ϼ���: ");
						bank[(bankNum - 1)].withdraw(s.nextInt());
					} catch (NegativeBalanceException e) {
						System.out.println(e.getMessage() + "\n");
						continue;
					}
					
					System.out.println("����� �Ϸ�Ǿ����ϴ�.\n");
				}
			}
		} while(correct == false);
		
		s.close();
	}
	
	public static void printBank(BankAccount[] b) {
		System.out.println("���� �ܰ���Ȳ�Դϴ�.");
		System.out.println("���¹�ȣ\t������\t�ܰ�");
		
		for(int i = 0; i < b.length; i++) {
			System.out.println((i + 1) + "\t" + b[i].getOwner() + "\t" + b[i].getBalance());
		}
	}
}
