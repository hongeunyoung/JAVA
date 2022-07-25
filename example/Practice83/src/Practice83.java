//���ǰ����а� 20170809 ȫ����

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
			System.out.print("���ϴ� �۾��� �����ϼ��� (0-����/1-����/2-����/3-���¾���): ");
			int work = s.nextInt();
			
			if(work == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				correct = false;
			}
			else if(work == 1) {
				System.out.print("���� �̸��� �Է��ϼ���: ");
				name = s.next();
				
				load(name, list);
			}
			else if(work == 2) {
				System.out.print("���� �̸��� �Է��ϼ���: ");
				String newFile = s.next();
				
				save(newFile, list);
				
				System.out.println("�ܰ���Ȳ�� ���������� ����Ǿ����ϴ�.\n");
			}
			else if(work == 3) {
				System.out.print("������Ʈ�� ���¹�ȣ�� �Է��ϼ���: ");
				int acc = s.nextInt();
				
				System.out.print("���ϴ� ���� �۾��� �����ϼ��� (1-�Ա�/2-���): ");
				int accWork = s.nextInt();
				
				if(accWork == 1) {
					System.out.print("�Աݾ��� �Է��ϼ���: ");
					int deposit = s.nextInt();
					int money = list.get((acc - 1)).getBalance() + deposit;
					list.get((acc- 1)).setBalance(money);
					
					System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
					
					System.out.println("\n���� �ܰ���Ȳ�Դϴ�");
					System.out.println("���¹�ȣ\t������\t�ܰ�");
					
					for(int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i).getNum() + "\t" + list.get(i).getOwner() + "\t" + list.get(i).getBalance());
					}
					
					System.out.println();
				}
				else {
					System.out.print("��ݾ��� �Է��ϼ���: ");
					int withdraw = s.nextInt();
					int money = list.get((acc- 1)).getBalance() - withdraw;
					list.get((acc- 1)).setBalance(money);
					
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");
					
					System.out.println("\n���� �ܰ���Ȳ�Դϴ�");
					System.out.println("���¹�ȣ\t������\t�ܰ�");
					
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
			
			System.out.println("\n���� �ܰ���Ȳ�Դϴ�");
			System.out.println("���¹�ȣ\t������\t�ܰ�");
			
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
