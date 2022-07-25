//���ǰ����а� 20170809 ȫ����

@SuppressWarnings("serial")
class NegativeBalanceException extends Exception {
	public NegativeBalanceException(String message) {super(message);}
}

public class BankAccount {
	private String owner; //������ �̸�
	private int balance; //�����ܰ�
	
	public BankAccount() {
		this("��", -1);
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
	
	public void deposit(int money) throws NegativeBalanceException {
		if(money < 0) {
			throw (new NegativeBalanceException("�Աݾ����� �������� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���."));
		}
		
		this.balance += money;
	}
	
	public void withdraw(int money) throws NegativeBalanceException {
		if(balance < money) {
			throw (new NegativeBalanceException("��ݾ��� �ܰ����� �����ϴ�. �ٽ� �Է��ϼ���."));
		}
		
		if(money < 0) {
			throw (new NegativeBalanceException("��ݾ����� �������� �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���."));
		}
		
		this.balance -= money;
	}
}