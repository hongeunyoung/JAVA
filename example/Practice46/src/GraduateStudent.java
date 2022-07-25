//���ǰ����а� 20170809 ȫ����

public class GraduateStudent extends Student{
	private String lab; //������
	
	public GraduateStudent() {
		super(0, 0, 0.0);
		this.lab = "��";
	}
	
	public GraduateStudent(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String getLab() {return lab;}
	public void setLab(String lab) {this.lab = lab;}
	
	public String toString() {
		return super.toString() + ", ������: " + lab;
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
