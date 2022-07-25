//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

public class Practice16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player;
		int comCount = 0, youCount = 0, draw = 0;
		
		while(true)
		{
			System.out.println("���� ����� ����: " + youCount + "�� " + comCount + "�� " + draw + "��");
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
				System.out.print("����� �Է�(����/����/��/�׸�): ");
				player = sc.next();
				
				if(player.equals("����") || player.equals("����") || player.equals("��") || player.equals("�׸�")) {
					break;
				}
				else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
				}
			}
			
			if(player.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			if(whoswin(computer, player) == 1) {
				youCount++;
				System.out.println("����� �̰���ϴ�.");
			}
			else if(whoswin(computer, player) == -1) {
				comCount++;
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
			else {
				draw++;
				System.out.println("�����ϴ�.");
			}
		}
		
		sc.close();
	}
	
	public static int whoswin(String com, String you) {
		if((com.equals("����") && you.equals("����")) || (com.equals("����") && you.equals("��")) || (com.equals("��") && you.equals("����"))) {
			return 1;
		}
		else if((com.equals("����") && you.equals("��")) || (com.equals("����") && you.equals("����")) || (com.equals("��") && you.equals("����"))) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
