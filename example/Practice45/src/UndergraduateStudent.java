//보건관리학과 20170809 홍은영

public class UndergraduateStudent extends Student {
	private int year; //학년
	
	public UndergraduateStudent(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	
	public String toString() {
		return super.toString() + ", 학년: " + year;
	}

	public int scholarship() {
		return (int)(super.getTuition() * 0.3);
	}
}
