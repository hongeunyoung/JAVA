//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice37 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date[] dateList = new Date[5];
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + " 번째 날짜를 입력하세요.");
			
			System.out.print("년도: ");
			int y = s.nextInt();
			
			System.out.print("월: ");
			int m = s.nextInt();
			
			System.out.print("일: ");
			int d = s.nextInt();
			
			dateList[i] = new Date(y, m, d);
		}
		
		s.close();
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + "번째 날짜는" + dateList[i].getYear() + "년 " + dateList[i].getMonth() + "월 " +dateList[i].getDay() + "일입니다.");
		}
	}
}
