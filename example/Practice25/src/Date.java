//보건관리학과 20170809 홍은영

public class Date {
	private int year;
	private int month;
	private int day;
	
	public int getYear() { return year;}
	public void setYear(int year) { this.year = year;}
	
	public int getMonth() { return month;}
	public void setMonth(int month) { this.month = month;}
	
	public int getDay() { return day;}
	public void setDay(int day) { this.day = day;}
	
	public String toString() {
		String rslt ="";
		
		rslt += getYear() + "년 ";
		rslt += getMonth() + "월 ";
		rslt += getDay() +  "일";
		
		return rslt;
	}
}
