//보건관리학과 20170809 홍은영

public class Student {
	private int id; //학번
	private int tuition; //등록금
	private double gpa; //평균등급
	
	public Student(int  id, int tuition, double gpa) {
		super();
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public int getTuition() {return tuition;}
	public void setTuition(int tuition) {this.tuition = tuition;}
	
	public double getGpa() {return gpa;}
	public void setGpa(double gpa) {this.gpa = gpa;}
	
	public int getId() {return id;}
	
	public String toString() {
		String rslt = "";
		
		rslt += "학번: " + id + ", 등록금: " + tuition;
		rslt += ", 평균등급: " + gpa;
		rslt += ", 장학금: " + scholarship();
		
		return rslt;
	}
	
	public int scholarship() {
		return (int)(tuition * 0.5);
	}
}
