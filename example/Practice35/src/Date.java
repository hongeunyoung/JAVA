//보건관리학과 20170809 홍은영

public class Date {
	private Integer year;
	private Integer month;
	private Integer day;
	
	public Integer getYear() { return year;}
	public void setYear(Integer year) { this.year = year;}
	
	public Integer getMonth() { return month;}
	public void setMonth(Integer month) { this.month = month;}
	
	public Integer getDay() { return day;}
	public void setDay(Integer day) { this.day = day;}
	
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
	
	public Date(Integer year) {
		this.year = year;
		this.month = 1;
		this.day = 1;
	}
	
	public Date(Integer year, Integer month) {
		this.year = year;
		this.month = month;
		this.day = 1;
	}
	
	public Date(Integer year, Integer month, Integer day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
