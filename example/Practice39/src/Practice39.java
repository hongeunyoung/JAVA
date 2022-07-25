//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice39 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Date[] dateList = new Date[5];
		
		for(int i = 0; i < dateList.length; i++) {
			dateList[i] = new Date();
		}
		
		Date earlist = dateList[0];
		int earlistIndex = 1;
		
		for(int i = 0; i < dateList.length; i++) {
			System.out.println((i + 1) + "번째 날짜를 입력하세요.");
			
			System.out.print("년도: ");
			dateList[i].setYear(s.nextInt());
			
			System.out.print("월: ");
			dateList[i].setMonth(s.nextInt());
			
			System.out.print("일: ");
			dateList[i].setDay(s.nextInt());
			
			if(Date.compareDate(earlist, dateList[i]) == 1) {
				earlist = dateList[i];
				earlistIndex = (i + 1);
			}
		}
		
		s.close();
		
		System.out.println("가장 빠른 날짜는 " + earlistIndex + "번째 입력된 " + earlist.toString() + "입니다.");
	}
}
