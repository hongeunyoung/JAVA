//���ǰ����а� 20170809 ȫ����

import java.util.Random;
import java.util.HashSet;

public class Practice72 {
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i = 1; i <= 10; i++) {
			HashSet<Integer> set = new HashSet<Integer>();
			
			for(int j = 0; j < 5; j++) {
				int temp;
				
				do {
					temp = r.nextInt(90) + 10;
				} while(set.contains(temp));
				
				set.add(temp);
			}
			
			System.out.println("(" + i + "ȸ) " + set);
		}
	}
}
