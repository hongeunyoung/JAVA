//���ǰ����а� 20170809 ȫ����

@SuppressWarnings("serial")

class MyException extends Exception {
	public MyException(String message) {super(message);}
}

public class Practice58 {
	public static void checkNegative(int number) throws MyException {
		if (number < 0) {
			throw (new MyException("������ �ȵ˴ϴ�."));
		}
		
		System.out.println("������ ������ �ƴϱ���");
	}
	public static void main(String[] args) {
		try {
			checkNegative(1);
			checkNegative(-1); 
			// number < 0 �̱� ������ checkNegative���� ������ ��� ���� �߻�
		} catch (MyException ex) {ex.printStackTrace();} 
		//������ �߻��ϸ� ȣ�⽺���� ����ؼ� ���� �ڵ忡 checkNegative�� ���.
	}
}
