//���ǰ����а� 20170809 ȫ����

import java.util.Random;

public class Practice08 {

	public static void main(String[] args) {
		Random rg = new Random();
		
		for(int i = 1; i < 11; i++) {
			System.out.println("(" + i + "�� ����)");
			
			int x = rg.nextInt(100);
			
			for(int j = 0; j < 10; j++) {
				System.out.print(x + "\t");
			}
			
			System.out.println();
		}
	}
}
