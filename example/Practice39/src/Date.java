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
	
	public Date() {
		this.year = 1990;
		this.month = 1;
		this.day = 1;
	}
	
	public Date(int year) {
		this.year = year;
		this.month = 1;
		this.day = 1;
	}
	
	public Date(int year, int month) {
		this.year = year;
		this.month = month;
		this.day = 1;
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	protected boolean isReap() {
		if(this.year % 100 != 0 && this.year % 4 == 0 || this.year % 400 == 0) {
			return true;
		}
		
		return false;
	}
	
	public String testReapYears() {
		String rs = this.year + "년은 ";
		
		if(isReap()) {
			rs += "윤년입니다.";
		}
		else {
			rs += "윤년이 아닙니다.";
		}
		
		return rs;
	}
	
	public String printWestern() {
		String[] mon  = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		return mon[getMonth() - 1] + " " + getDay() + ", " + getYear();
	}
	
	public static int compareDate(Date x, Date y) {
		if(x.getYear() < y.getYear()) {
			return -1;
		}
		else if(x.getYear() > y.getYear()) {
			return 1;
		}
		else {
			if(x.getMonth() < y.getMonth()) {
				return -1;
			}
			else if(x.getMonth() > y.getMonth()) {
				return 1;
			}
			else {
				if(x.getDay() < y.getDay()) {
					return -1;
				}
				else if(x.getDay() > y.getDay()) {
					return 1;
				}
				else {
					return 0;
				}
			}
		}
	}
}
