//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

public class Practice14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player;
		
		int computerRand = rg.nextInt(3);
		
		if(computerRand == 0) {
			computer = "����";
		}
		else if(computerRand == 1) {
			computer = "����";
		}
		else {
			computer = "��";
		}
		
		System.out.println("��ǻ���� ����: " + computer);
		
		while(true)
		{
			System.out.print("����� �Է�: ");
			player = sc.next();
			
			if(player.equals("����") || player.equals("����") || player.equals("��")) {
				break;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		
		if((computer.equals("����") && player.equals("����")) || (computer.equals("����") && player.equals("��")) || (computer.equals("��") && player.equals("����"))) {
			System.out.println("����� �̰���ϴ�.");
		}
		else if((computer.equals("����") && player.equals("��")) || (computer.equals("����") && player.equals("����")) || (computer.equals("��") && player.equals("����"))) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
		
		sc.close();
	}
}
