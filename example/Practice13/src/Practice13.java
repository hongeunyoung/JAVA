//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String player1 = "ö��", player2 = "����";
		
		String chul = Play(player1, sc);
		String young = Play(player2, sc);
		
		if((chul.equals("����") && young.equals("����")) || (chul.equals("����") && young.equals("��")) || (chul.equals("��") && young.equals("����"))) {
			System.out.println("���� �̰���ϴ�.");
		}
		else if((chul.equals("����") && young.equals("��")) || (chul.equals("����") && young.equals("����")) || (chul.equals("��") && young.equals("����"))) {
			System.out.println("ö���� �̰���ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
		
		sc.close();
	}
	
	public static String Play(String player, Scanner sc) {
		String select;
		
		while(true)
		{
			System.out.print(player + "�� �Է�: ");
			select = sc.next();
			
			if(select.equals("����")|| select.equals("����")|| select.equals("��")) {
				return select;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
}
