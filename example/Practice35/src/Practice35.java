//보건관리학과 20170809 홍은영

public class Practice35 {
	public static void main(String[] args) {
		Date date1 = new Date();
		date1.setYear(2007);
		date1.setMonth(2);
		date1.setDay(18);
		
		Date date2 = new Date(2006);
		date2.setMonth(3);
		date2.setDay(2);
		
		Date date3 = new Date(2007, 2);
		date3.setDay(27);
		
		Date date4 = new Date(2007, 3, 2);
		
		Date date5 = new Date(2007, 4);
		date5.setDay(20);
		
		Date date6 = new Date(2007, 4, 26);
		
		System.out.println("오늘은 " + date1.toString() + "입니다.");
		System.out.println("내가 동덕여자대학교에 입학한 날짜는 " + date2.toString() + "입니다.");
		System.out.println("2007학년도 개강일은 " + date3.toString() + "에서 " + date4.toString() + "로 변경되었습니다.");
		System.out.println("중간고사 기간은 " + date5.toString() + "부터 " + date6.toString() + "까지 입니다.");
	}
}
