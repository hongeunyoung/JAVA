//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BodyData i = new BodyData();
		BodyData you = new BodyData();
		
		System.out.print("�� Ű�� �Է��ϼ���: ");
		i.getHeight(sc.nextInt());
		System.out.print("�� �����Ը� �Է��ϼ���: ");
		i.getWeight(sc.nextInt());
		
		System.out.print("����� Ű�� �Է��ϼ���: ");
		you.getHeight(sc.nextInt());
		System.out.print("����� �����Ը� �Է��ϼ���: ");
		you.getWeight(sc.nextInt());
		
		sc.close();
		
		if(i.isTallerThan(you)) {
			if(you.isTallerThan(i)) {
				System.out.println("���� ����� Ű�� �����ϴ�.");
			}
			else {
				System.out.println("Ű�� ���� �� Ů�ϴ�.");
			}
		}
		else {
			System.out.println("Ű�� ����� �� Ů�ϴ�.");
		}
		
		if(i.needDiet()) {
			System.out.println("���� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		else {
			System.out.println("���� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
		
		if(you.needDiet()) {
			System.out.println("����� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		else {
			System.out.println("����� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");
		}
	}
}
