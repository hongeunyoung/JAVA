//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

@SuppressWarnings("serial")
class NoSuchAccountException extends Exception {
	public NoSuchAccountException(String message) {super(message);}
}

@SuppressWarnings("serial")
class NoSuchOperationException extends Exception {
	public NoSuchOperationException(String message) {super(message);}
}

public class Practice63 {
	private static void getAccInfo(Scanner scan, BankAccount[] ba) {
		for(int i = 0; i < ba.length; i++) {
			ba[i] = new BankAccount();
			
			System.out.print("������ �̸��� �Է��ϼ���: ");
			ba[i].setOwner(scan.next());
			
			System.out.print("�ܰ� �Է��ϼ���: ");
			ba[i].setBalance(scan.nextInt());
		}
	}
	
	private static void printAccInfo(BankAccount[] ba) {
		System.out.println("���� �ܰ���Ȳ�Դϴ�.");
		System.out.println("���¹�ȣ\t������\t�ܰ�");
		
		for(int i = 0; i < ba.length; i++) {
			System.out.println((i + 1) + "\t" + ba[i].getOwner() + "\t" + ba[i].getBalance());
		}
	}
	
	private static int getAccNum(Scanner scan, BankAccount[] ba) throws NoSuchAccountException {
		int num = scan.nextInt();
		
		if(num < 0 || num > ba.length)
			throw (new NoSuchAccountException("�߸��� ���¹�ȣ �Դϴ�. �ٽ� �Է��ϼ���."));
		
		return num;
	}
	
	private static int getOperationNum(Scanner scan) throws NoSuchOperationException {
		int num = scan.nextInt();
		
		if(num == 1 || num == 2)
			return num;
		
		throw (new NoSuchOperationException("�߸��� �۾��Դϴ�. �ٽ� �Է��ϼ���."));	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BankAccount[] bank = new BankAccount[3];
		
		getAccInfo(s, bank);
		
		boolean correct = false;
		do {
			printAccInfo(bank);
			
			try {
				System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ��� (����-0): ");
				int bankNum = getAccNum(s, bank);
				
				if(bankNum == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					correct = true;
				}
				else {
					System.out.print("���ϴ� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
					int work = getOperationNum(s);
					
					if(work == 1) {
						System.out.print("�Աݾ��� �Է��ϼ���: ");
						bank[(bankNum - 1)].deposit(s.nextInt());
						
						System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					}
					else {
						System.out.print("��ݾ��� �Է��ϼ���: ");
						bank[(bankNum - 1)].withdraw(s.nextInt());
						
						System.out.println("����� �Ϸ�Ǿ����ϴ�.\n");
					}
				}
			} catch (NoSuchAccountException e) {
				System.out.println(e.getMessage() + "\n");
				continue;
			} catch (NoSuchOperationException e) {
				System.out.println(e.getMessage() + "\n");
				continue;
			} catch (NegativeBalanceException e) {
				System.out.println(e.getMessage() + "\n");
				continue;
			}
		} while(correct == false);
		
		s.close();
	}
}
