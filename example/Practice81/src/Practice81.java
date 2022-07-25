//보건관리학과 20170809 홍은영

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;


public class Practice81 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("난수값이 저장된 파일 이름을 입력하세요: ");
			String name = s.next();
			Scanner scan = new Scanner(new FileReader(name));
			System.out.println("파일에서 난수를 읽어 들입니다.");
			
			int count = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while (scan.hasNext()) {
				list.add(scan.nextInt());
				count++;
			}
		
			System.out.println("난수의 개수는 모두 " + count + "개입니다.");
			
			System.out.println("입력된 난수는 다음과 같습니다.");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "\t");
				
				if(i % 10 == 9) {
					System.out.println();
				}
			}
			
			Collections.sort(list);
			
			System.out.println("\n정렬된 난수는 다음과 같습니다.");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "\t");
				
				if(i % 10 == 9) {
					System.out.println();
				}
			}
			
			if (scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
