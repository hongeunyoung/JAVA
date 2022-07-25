//보건관리학과 20170809 홍은영

public class GraduateStudent extends Student{
	private String lab; //연구실
	
	public GraduateStudent() {
		super(0, 0, 0.0);
		this.lab = "모름";
	}
	
	public GraduateStudent(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String getLab() {return lab;}
	public void setLab(String lab) {this.lab = lab;}
	
	public String toString() {
		return super.toString() + ", 연구실: " + lab;
	}

	public int scholarship() {
		if(super.getGpa() >= 3.5) {
			return (int)(super.getTuition() * 0.5);
		}
		else {
			return (int)(super.getTuition() * 0.1);
		}
	}
}
