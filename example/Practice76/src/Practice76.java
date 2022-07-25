//보건관리학과 20170809 홍은영

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
			System.out.print("(" + count + "차) ");
			
			ArrayList<Integer> list = getRandomNumbers(c);
			printArray(list);
			check = searchArray(list, c.getKey());
			
			System.out.println();
		}
		
		System.out.println(count + "차 실행에서 난수 " + c.getKey() + "이 발생했으므로 프로그램을 종료합니다.");
	}
	
	@SuppressWarnings("resource")
	private static Config getInput() throws ImproperKeyValueException {
		Scanner s = new Scanner(System.in);
		Config c = new Config();
		
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		c.setSize(s.nextInt());
		
		System.out.print("난수값의 범위를 설정하세요: ");
		c.setRange(s.nextInt());
		
		System.out.print("찾고 싶은 난수값을 입력하세요: ");
		c.setKey(s.nextInt());
		
		if(c.getKey() > c.getRange() || c.getKey() < 0) {
			throw(new ImproperKeyValueException("난수값의 범위가 잘못되었습니다."));
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
