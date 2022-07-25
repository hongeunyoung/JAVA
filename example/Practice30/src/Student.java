//���ǰ����а� 20170809 ȫ����

public class Student extends Person {
	private long sid;
	private String major;
	
	public long getSid() { return sid;}
	public void setSid(int sid) { this.sid = sid;}
	
	public String getMajor() { return major;}
	public void setMajor(String major) { this.major = major;}
	
	public Student() {
		super();
		this.sid = -1;
		this.major = "��";
	}
	
	public Student(String name) {
		super(name);
		this.sid = -1;
		this.major = "��";
	}
	
	public Student(String name, long sid) {
		super(name, -1);
		this.sid = sid;
		this.major = "��";
	}
	
	public Student(String name, long sid, String major) {
		super(name, -1, "��");
		this.sid = sid;
		this.major = major;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += super.toString() + ", ";
		rslt += "�й�: " + getSid() + ", ";
		rslt += "����: " + getMajor();
		
		return rslt;
	}
	
	public String printSafely() {
		String rslt = "";
		
		rslt += "�̸�: " + getName() + ", ";
		rslt += "�й�: " + getSid() + ", ";
		rslt += "����: " + getMajor();
		
		return rslt;
	}
}
