//보건관리학과 20170809 홍은영

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice83 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		String name = "";
		
		boolean correct = true;
		do {
			System.out.print("원하는 작업을 선택하세요 (0-종료/1-열기/2-저장/3-계좌업무): ");
			int work = s.nextInt();
			
			if(work == 0) {
				System.out.println("프로그램을 종료합니다.");
				correct = false;
			}
			else if(work == 1) {
				System.out.print("파일 이름을 입력하세요: ");
				name = s.next();
				
				load(name, list);
			}
			else if(work == 2) {
				System.out.print("파일 이름을 입력하세요: ");
				String newFile = s.next();
				
				save(newFile, list);
				
				System.out.println("잔고현황이 성공적으로 저장되었습니다.\n");
			}
			else if(work == 3) {
				System.out.print("업데이트할 계좌번호를 입력하세요: ");
				int acc = s.nextInt();
				
				System.out.print("원하는 계좌 작업을 선택하세요 (1-입금/2-출금): ");
				int accWork = s.nextInt();
				
				if(accWork == 1) {
					System.out.print("입금액을 입력하세요: ");
					int deposit = s.nextInt();
					int money = list.get((acc - 1)).getBalance() + deposit;
					list.get((acc- 1)).setBalance(money);
					
					System.out.println("입급이 완료되었습니다.");
					
					System.out.println("\n현재 잔고현황입니다");
					System.out.println("계좌번호\t계좌주\t잔고");
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).getNum() + "\t" + list.get(i).getOwner() + "\t" + list.get(i).getBalance());
					}
					
					System.out.println();
				}
				else {
					System.out.print("출금액을 입력하세요: ");
					int withdraw = s.nextInt();
					int money = list.get((acc- 1)).getBalance() - withdraw;
					list.get((acc- 1)).setBalance(money);
					
					System.out.println("출금이 완료되었습니다.");
					
					System.out.println("\n현재 잔고현황입니다");
					System.out.println("계좌번호\t계좌주\t잔고");
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).getNum() + "\t" + list.get(i).getOwner() + "\t" + list.get(i).getBalance());
					}
					
					System.out.println();
				}
			}
		} while(correct);
		
		s.close();
	}
	
	public static void load(String fname, ArrayList<BankAccount> list) {
		try {
			Scanner scan = new Scanner(new FileReader(fname));
			
			while (scan.hasNext()) {
				list.add(new BankAccount(scan.nextInt(), scan.next(), scan.nextInt()));
			}
			
			System.out.println("\n현재 잔고현황입니다");
			System.out.println("계좌번호\t계좌주\t잔고");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getNum() + "\t" + list.get(i).getOwner() + "\t" + list.get(i).getBalance());
			}
			
			System.out.println();
			
			if (scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static void save(String fname , ArrayList<BankAccount> list) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(fname));
			
			for(int i = 0; i < list.size(); i++) {
				pw.println(list.get(i).getNum() + "\t" + list.get(i).getOwner() + "\t" + list.get(i).getBalance());
			}
			
			if (pw != null) {
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
