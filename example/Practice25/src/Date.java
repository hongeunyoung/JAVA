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
}
