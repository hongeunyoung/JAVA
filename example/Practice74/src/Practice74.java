//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice74 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수형 RandomList를 생성합니다.");
		RandomList<Integer> randomList = new RandomList<Integer>();
		
		boolean check = true;
		
		while(check) {
			System.out.print("원하는 기능을 선택하세요 (1-추가/2-출력/3-무작위/4-종료) : ");
			int choose = s.nextInt();
			
			if(choose == 1) {
				System.out.print("추가하고 싶은 원소의 개수를 입력하세요: ");
				int count = s.nextInt();
				int size = randomList.list.size();
				
				for(int i = size; i < (size + count); i++) {
					System.out.print("[" + i + "]번 원소 : ");
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
					System.out.println("무작위 원소 출력: " + randomList.select() + "\n");
				} catch (ImproperArraySizeException e) {
					System.out.println(e.getMessage() + "\n");
				}
			}
			else if(choose == 4) {
				System.out.println("프로그램을 종료합니다.");
				check = false;
			}
		}
		
		s.close();
	}
}
