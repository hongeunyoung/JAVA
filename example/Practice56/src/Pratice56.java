//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Pratice56 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean isDone;
		int[] n = new int[2];
		
		//1�� �ǿ�����, 2�� �ǿ����ڸ� �Է¹޾ƾ� �ؼ� �ݺ��� ���.
		for(int i = 0; i < n.length; i++) {
			isDone = false;
			
			while(isDone != true) {
				try {
					System.out.println((i + 1) + "�� �ǿ����ڸ� �Է��ϼ���: ");
					String str = s.next();
					
					n[i] = Integer.parseInt(str);
					
					//������ ������ ���� ������ isDone�� true�� �ż� while���� ����ȴ�.
					isDone = true;
				//�Է¹��� ���� ���ڰ� �ƴϸ� ���ܰ� �߻��Ѵ�. ���ܰ� �߻������� ����Ǵ� ���.
				} catch (NumberFormatException e) {
					System.out.println("�߸��� ������ �����Դϴ�. �ٽ� �Է��ϼ���.");
				}
			}
		}
		
		s.close();
		
		System.out.println(n[0] + " + " + n[1] + " = " + (n[0] + n[1]));
	}
}
