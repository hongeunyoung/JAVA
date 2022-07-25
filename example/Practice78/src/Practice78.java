//보건관리학과 20170809 홍은영

public class Practice78 {
	public static void main(String[] args) {
		//1
		Movie m1 = new Movie();
		
		System.out.println("첫 번째 영화의 정보입니다.");
		System.out.println(m1.toString());
		
		//2
		Date d1 = new Date(2010, 7, 25);
		Movie m2 = new Movie("인셉션", "놀럼", d1);
		
		System.out.println("두 번째 영화의 정보입니다.");
		System.out.println(m2.toString());
		
		//3
		Movie m3 = new Movie("러브 액추얼리", "리처드 커티스");
		//1번 방법:  viewDay에 대한 참조변수를 얻어와서 그 정보를 수정
		Date dTmp = m3.getViewDay();
		dTmp.setYear(2015);
		dTmp.setMonth(12);
		dTmp.setDay(24);
		/*2번 방법: 새로운 정보를 담고 있는 별도의 객체 생성 후 교환
		Date d2 = new Date(2015, 12, 24);
		m3.setViewDay(d2);
		*/
		
		System.out.println("세 번째 영화의 정보입니다.");
		System.out.println(m3.toString());
	}
}
