//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("serial")
class InvalidInputException extends Exception {
	public InvalidInputException(String message) {super(message);}
}

public class Practice60 {
	public static void checkNegative(String player) throws InvalidInputException {
		if(player.equals("����") == false && player.equals("����") == false && player.equals("��") == false)  {
			throw (new InvalidInputException("�߸��� �Է��Դϴ�."));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		String computer, player = "";
		
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
		
		try {
			player = getInput(sc);
			checkNegative(player);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			sc.close();
		}
		
		if(whoswin(computer, player) == 1) {
			System.out.println("����� �̰���ϴ�.");
		}
		else if(whoswin(computer, player) == -1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
		else {
			System.out.println("�����ϴ�.");
		}
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
	
	public static String getInput(Scanner s) throws InvalidInputException {
		System.out.print("����� �Է�: ");
		String rslt = s.next();
		
		return rslt;
	}
}