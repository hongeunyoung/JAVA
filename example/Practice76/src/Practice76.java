//���ǰ����а� 20170809 ȫ����

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice76 {
	public static void main(String[] args) {
		Config c = new Config();
		
		try {
			c = getInput();
		} catch (ImproperKeyValueException e) {
			System.out.println(e.getMessage());
			
			return;
		}
		
		boolean check = false;
		int count = 0;
		
		while(check == false) {
			count++;
			System.out.print("(" + count + "��) ");
			
			ArrayList<Integer> list = getRandomNumbers(c);
			printArray(list);
			check = searchArray(list, c.getKey());
			
			System.out.println();
		}
		
		System.out.println(count + "�� ���࿡�� ���� " + c.getKey() + "�� �߻������Ƿ� ���α׷��� �����մϴ�.");
	}
	
	@SuppressWarnings("resource")
	private static Config getInput() throws ImproperKeyValueException {
		Scanner s = new Scanner(System.in);
		Config c = new Config();
		
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		c.setSize(s.nextInt());
		
		System.out.print("�������� ������ �����ϼ���: ");
		c.setRange(s.nextInt());
		
		System.out.print("ã�� ���� �������� �Է��ϼ���: ");
		c.setKey(s.nextInt());
		
		if(c.getKey() > c.getRange() || c.getKey() < 0) {
			throw(new ImproperKeyValueException("�������� ������ �߸��Ǿ����ϴ�."));
		}
		
		s.close();
		
		return c;
	}
	
	private static ArrayList<Integer> getRandomNumbers(Config c) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 0; i <= c.getRange(); i++) {
			temp.add(i);
		}
		
		Collections.shuffle(temp);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < c.getSize(); i++) {
			arr.add(temp.get(i));
		}
		
		return arr;
	}
	
	private static void printArray(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		System.out.println();
	}
	
	 private static boolean searchArray(ArrayList<Integer> list, Integer key) {
		 for(int i = 0; i < list.size(); i++) {
			 if(list.get(i) == key) {
				 return true;
			 }
		 }
		 
		 return false;
	 }
	
	
}
