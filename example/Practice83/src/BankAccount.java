//���ǰ����а� 20170809 ȫ����

public class BankAccount {
	private String owner; //������ �̸�
	private int balance; //�����ܰ�
	private int num;
	
	public BankAccount() {
		this(-1, "��", -1);
	}
	
	public BankAccount(int num, String owner, int balance) {
		this.num = num;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}
	
	public String toString() {
		return owner + "\t" + balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
}
