//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice36 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("1��° ������ x��ǥ: ");
		int x1 = s.nextInt();
		
		System.out.print("1��° ������ y��ǥ: ");
		int y1 = s.nextInt();
		
		Pair p1 =  new Pair(x1, y1);
		
		System.out.print("2��° ������ x��ǥ: ");
		int x2 = s.nextInt();
		
		System.out.print("2��° ������ y��ǥ: ");
		int y2 = s.nextInt();
		
		s.close();
		
		Pair p2 = new Pair(x2, y2);
		
		System.out.println("�Էµ� 1�� ������: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("�Էµ� 2�� ������: (" + p2.getX() + ", " + p2.getY() + ")");
		
		Pair pAdd = Pair.add(p1, p2);
		System.out.println("���� ��� : " + pAdd.toString());
		
		Pair pSub = Pair.sub(p1, p2);
		System.out.println("���� ��� : " + pSub.toString());
		
		Pair pMult = Pair.mult(p1, p2);
		System.out.println("���� ��� : " + pMult.toString());
		
		Pair pDiv = Pair.div(p1, p2);
		System.out.println("������ ��� : " + pDiv.toString());
	}
}
