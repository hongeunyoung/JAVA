//보건관리학과 20170809 홍은영

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
			
			System.out.print("예금주 이름을 입력하세요: ");
			ba[i].setOwner(scan.next());
			
			System.out.print("잔고를 입력하세요: ");
			ba[i].setBalance(scan.nextInt());
		}
	}
	
	private static void printAccInfo(BankAccount[] ba) {
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		
		for(int i = 0; i < ba.length; i++) {
			System.out.println((i + 1) + "\t" + ba[i].getOwner() + "\t" + ba[i].getBalance());
		}
	}
	
	private static int getAccNum(Scanner scan, BankAccount[] ba) throws NoSuchAccountException {
		int num = scan.nextInt();
		
		if(num < 0 || num > ba.length)
			throw (new NoSuchAccountException("잘못된 계좌번호 입니다. 다시 입력하세요."));
		
		return num;
	}
	
	private static int getOperationNum(Scanner scan) throws NoSuchOperationException {
		int num = scan.nextInt();
		
		if(num == 1 || num == 2)
			return num;
		
		throw (new NoSuchOperationException("잘못된 작업입니다. 다시 입력하세요."));	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BankAccount[] bank = new BankAccount[3];
		
		getAccInfo(s, bank);
		
		boolean correct = false;
		do {
			printAccInfo(bank);
			
			try {
				System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
				int bankNum = getAccNum(s, bank);
				
				if(bankNum == 0) {
					System.out.println("프로그램을 종료합니다.");
					correct = true;
				}
				else {
					System.out.print("원하는 작업은 선택하세요 (1-입금/2-출금): ");
					int work = getOperationNum(s);
					
					if(work == 1) {
						System.out.print("입금액을 입력하세요: ");
						bank[(bankNum - 1)].deposit(s.nextInt());
						
						System.out.println("입급이 완료되었습니다.");
					}
					else {
						System.out.print("출금액을 입력하세요: ");
						bank[(bankNum - 1)].withdraw(s.nextInt());
						
						System.out.println("출급이 완료되었습니다.\n");
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
