//���ǰ����а� 20170809 ȫ����

public class Student {
	private int id; //�й�
	private int tuition; //��ϱ�
	private double gpa; //��յ��
	
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
		
		rslt += "�й�: " + id + ", ��ϱ�: " + tuition;
		rslt += ", ��յ��: " + gpa;
		rslt += ", ���б�: " + scholarship();
		
		return rslt;
	}
	
	public int scholarship() {
		return (int)(tuition * 0.5);
	}
}
