//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice38 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date date1 = new Date();
		
		System.out.println("첫 번째 날짜를 입력하세요.");
		
		System.out.print("년도: ");
		date1.setYear(s.nextInt());
		
		System.out.print("월: ");
		date1.setMonth(s.nextInt());
		
		System.out.print("일: ");
		date1.setDay(s.nextInt());
		
		Date date2 = new Date();
		
		System.out.println("두 번째 날짜를 입력하세요.");
		
		System.out.print("년도: ");
		date2.setYear(s.nextInt());
		
		System.out.print("월: ");
		date2.setMonth(s.nextInt());
		
		System.out.print("일: ");
		date2.setDay(s.nextInt());
		
		s.close();
		
		if(Date.compareDate(date1, date2) == -1) {
			System.out.println("첫 번째 날짜인 " + date1.toString() + "이 이른 날짜입니다.");
		}
		else if(Date.compareDate(date1, date2) == 1) {
			System.out.println("두 번째 날짜인 " + date2.toString() + "이 이른 날짜입니다.");
		}
		else {
			System.out.println("두 날짜는 같은 날짜입니다.");
		}
	}
}
