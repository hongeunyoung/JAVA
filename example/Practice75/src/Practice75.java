//���ǰ����а� 20170809 ȫ����

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice75 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		int size = s.nextInt();
		
		System.out.print("�������� ������ �����ϼ���: ");
		int range = s.nextInt();
		
		System.out.print("������ ���� �迭�� ������ �����ϴ�.");
		ArrayList<Integer> random = getRandomList(size, range);
		printArray10PerLine(random);
		
		System.out.print("���ĵ� ���� �迭�� ������ �����ϴ�.");
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i < random.size(); i++) {
			temp.add(random.get(i));
		}
		
		Collections.shuffle(temp);
		printArray10PerLine(temp);
		
		System.out.print("������ ���� �迭�� ������ �����ϴ�.");
		printArray10PerLine(random);
		
		int max = random.get(0), min = random.get(0);
		for(int i = 1; i < random.size(); i++) {
			if(max < random.get(i)) {
				max = random.get(i);
			}
			
			if(min > random.get(i)) {
				min = random.get(i);
			}
		}
		
		System.out.println("���� ū ��: " + max + ", ���� ���� ��: " + min);
		
		s.close();
	}
	
	public static void printArray10PerLine(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++) {
			if(i % 10 == 0) {
				System.out.println();
			}
			
			System.out.print(a.get(i) + "\t");
		}
		
		System.out.println();
	}
	
	public static ArrayList<Integer> getRandomList(int size, int range) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i <= range; i++) {
			temp.add(i);
		}
		
		Collections.shuffle(temp);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++) {
			arr.add(temp.get(i));
		}
		
		return arr;
	}
}
