//���ǰ����а� 20170809 ȫ����

public class UndergraduateStudent extends Student {
	private int year; //�г�
	
	public UndergraduateStudent(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	public String toString() {
		return super.toString() + ", �г�: " + year;
	}

	public int scholarship() {
		return (int)(super.getTuition() * 0.3);
	}
}
