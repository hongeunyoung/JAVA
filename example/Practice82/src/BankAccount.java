//보건관리학과 20170809 홍은영

public class BankAccount {
	private String owner; //계좌주 이름
	private int balance; //은행잔고
	private int num;
	
	public BankAccount() {
		this(-1, "모름", -1);
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
