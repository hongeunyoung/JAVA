//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice62 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BankAccount[] bank = new BankAccount[3];
		
		for(int i = 0; i < bank.length; i++) {
			bank[i] = new BankAccount();
			
			System.out.print("예금주 이름을 입력하세요: ");
			bank[i].setOwner(s.next());
			
			System.out.print("잔고를 입력하세요: ");
			bank[i].setBalance(s.nextInt());
		}
		
		boolean correct = false;
		do {
			printBank(bank);
			
			System.out.print("업데이트할 계좌번호를 입력하세요 (종료-0): ");
			int bankNum = s.nextInt();
			
			if(bankNum == 0) {
				System.out.println("프로그램을 종료합니다.");
				correct = true;
			}
			else {
				System.out.print("원하는 작업은 선택하세요 (1-입금/2-출금): ");
				int work = s.nextInt();
				
				if(work == 1) {
					System.out.print("입금액을 입력하세요: ");
					bank[(bankNum - 1)].deposit(s.nextInt());
					
					System.out.println("입급이 완료되었습니다.");
				}
				else {
					try {
						System.out.print("출금액을 입력하세요: ");
						bank[(bankNum - 1)].withdraw(s.nextInt());
					} catch (NegativeBalanceException e) {
						System.out.println(e.getMessage() + "\n");
						continue;
					}
					
					System.out.println("출급이 완료되었습니다.\n");
				}
			}
		} while(correct == false);
		
		s.close();
	}
	
	public static void printBank(BankAccount[] b) {
		System.out.println("현재 잔고현황입니다.");
		System.out.println("계좌번호\t계좌주\t잔고");
		
		for(int i = 0; i < b.length; i++) {
			System.out.println((i + 1) + "\t" + b[i].getOwner() + "\t" + b[i].getBalance());
		}
	}
}
