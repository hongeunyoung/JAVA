//���ǰ����а� 20170809 ȫ����

import java.util.Random;

public class Practice21 {

	public static void main(String[] args) {
		Random rg = new Random();
		int[] num = new int[10];
		int total = 0;
		double average = 0;
		
		// �迭 ���� ������ �Ͼ�� ������ for each �Ұ���
		for(int i = 0; i < num.length; i++) {
			num[i] = rg.nextInt(101);
		}
		
		for(int value : num) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		
		// for each�� 0��°���� ���ʴ�� ó���ϱ� ������ ����� �� ����
		for(int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		for(int value : num) {
			total += value;
		}
		
		System.out.println("�������� ����: " +  total);
		
		//String.format()�� ����ϸ� ����ϰ� ���� �� �ִ�
		for(int value : num) {
			average += (double)value / num.length; 
		}
		
		System.out.println("�������� ���: " +  average);
	}
}
