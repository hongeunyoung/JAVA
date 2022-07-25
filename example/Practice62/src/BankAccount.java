//보건관리학과 20170809 홍은영

@SuppressWarnings("serial")
class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String message) {super(message);}
}

public class BankAccount {
	private String owner; //계좌주 이름
	private int balance; //은행잔고
	
	public BankAccount() {
		this("모름", -1);
	}
	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance = balance;}
	
	public String toString() {
		return owner + "\t" + balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws NegativeBalanceException {
		if(balance < money) {
			throw (new NegativeBalanceException("입력된 금액이 잘못되었습니다. 다시 입력하세요."));
		}
		
		this.balance -= money;
	}
}
