//���ǰ����а� 20170809 ȫ����

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
		
		rslt += getYear() + "�� ";
		rslt += getMonth() + "�� ";
		rslt += getDay() +  "��";
		
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
}
