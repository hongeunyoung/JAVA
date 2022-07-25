//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice74 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ RandomList�� �����մϴ�.");
		RandomList<Integer> randomList = new RandomList<Integer>();
		
		boolean check = true;
		
		while(check) {
			System.out.print("���ϴ� ����� �����ϼ��� (1-�߰�/2-���/3-������/4-����) : ");
			int choose = s.nextInt();
			
			if(choose == 1) {
				System.out.print("�߰��ϰ� ���� ������ ������ �Է��ϼ���: ");
				int count = s.nextInt();
				int size = randomList.list.size();
				
				for(int i = size; i < (size + count); i++) {
					System.out.print("[" + i + "]�� ���� : ");
					randomList.add(s.nextInt());
				}
				
				System.out.println();
			}
			else if(choose == 2) {
				randomList.print();
				
				System.out.println();
			}
			else if(choose == 3) {
				try {
					System.out.println("������ ���� ���: " + randomList.select() + "\n");
				} catch (ImproperArraySizeException e) {
					System.out.println(e.getMessage() + "\n");
				}
			}
			else if(choose == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				check = false;
			}
		}
		
		s.close();
	}
}
