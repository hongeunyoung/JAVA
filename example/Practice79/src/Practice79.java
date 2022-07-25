//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice79 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("입력을 원하는 영화의 편수를 입력하세요: ");
		int num = s.nextInt();
		
		Movie[] m = new Movie[num];
		
		for(int i = 0; i < num; i++) {
			m[i] = new Movie();
		}
		
		Movie fast = m[0];
		
		for(int i = 0; i < num; i++) {			
			System.out.println((i + 1) + "번 영화정보를 입력하세요.");
			
			System.out.print("영화제목은? ");
			m[i].setTitle(s.next());
			
			System.out.print("감독은? ");
			m[i].setDirector(s.next());
			
			System.out.print("관람 년도는? ");
			m[i].getViewDay().setYear(s.nextInt());
			
			System.out.print("관람 월은? ");
			m[i].getViewDay().setMonth(s.nextInt());
			
			System.out.print("관람 일은? ");
			m[i].getViewDay().setDay(s.nextInt());;
			
			if(i > 0) {
				if(m[i - 1].getViewDay().getYear() > m[i].getViewDay().getYear()) {
					fast = m[i];
				}
				else if(m[i - 1].getViewDay().getYear() == m[i].getViewDay().getYear()) {
					if(m[i - 1].getViewDay().getMonth() > m[i].getViewDay().getMonth()) {
						fast = m[i];
					}
					else if(m[i - 1].getViewDay().getMonth() == m[i].getViewDay().getMonth()) {
						if(m[i - 1].getViewDay().getDay() > m[i].getViewDay().getDay()) {
							fast = m[i];
						}
					}
				}
			}
		}
		
		System.out.println("입력된 영화 정보입니다.");
		
		for(int i = 0; i < num; i++) {
			System.out.println(m[i].printOneLine());
		}
		
		System.out.println("관림일이 가장 빠른 영화는 \"" + fast.getTitle() + "\"입니다.");
		
		s.close();
	}
}
