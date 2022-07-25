//���ǰ����а� 20170809 ȫ����

import java.util.ArrayList;
import java.util.Random;

public class Practice71 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Random r = new Random();
		
		double num;
		for(int i = 0; i < 10; i++) {
			do {
				num = r.nextDouble() * 11;
				//num = Math.random() * 10;
			} while(num > 10.0);
				
			list.add(num);
		}
		
		System.out.println("�ɻ����� ä�����");
		
		for(int i  = 0; i < 10; i++) {
			System.out.print(list.get(i) + "\t");
			
			if(i % 2 == 1) {
				System.out.println();
			}
		}
		
		System.out.println("\n��հ�: " + getAve(list) + "\n");
		
		System.out.println("���� ���� ����: " + findMax(list));
		System.out.println("���� ���� ����: " + findMin(list) + "\n");
		
		System.out.println("�ְ����� �������� ������ ���");
		
		for(int i  = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			
			if(i % 2 == 1) {
				System.out.println();
			}
		}
		
		System.out.println("\n���� ����: " + getAve(list));
	}
	
	public static Double findMax(ArrayList<Double> scores) {
		double max = scores.get(0);
		int maxIndex = 0;
		
		for(int i = 1; i < scores.size(); i++) {
			if(max < scores.get(i)) {
				max = scores.get(i);
				maxIndex = i;
			}
		}
		
		scores.remove(maxIndex);
		
		return max;
	}
	
	public static Double findMin(ArrayList<Double> scores) {
		double min = scores.get(0);
		int minIndex = 0;
		
		for(int i = 1; i < scores.size(); i++) {
			if(min > scores.get(i)) {
				min = scores.get(i);
				minIndex = i;
			}
		}
		
		scores.remove(minIndex);
		
		return min;
	}
	
	public static Double getAve(ArrayList<Double> scores) {
		double avg = 0;
		
		for(int i = 0; i < scores.size(); i++) {
			avg += scores.get(i) / scores.size();
		}
		
		return avg;
	}
}
