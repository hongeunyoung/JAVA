//���ǰ����а� 20170809 ȫ����

public class Practice54 {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt("abc");
			System.out.println("try: " + n);
		} catch (NumberFormatException e) {
			System.out.println("���� ���� ����");
		} finally {
			System.out.println("finally");
		}
		System.out.println("continue running");
		
		//������ ����
		/*
		���� ���� ����
		finally
		continue running
		*/
		
		// int n = Integer.parseInt("abc"); ���⼭ "abc"�� int���� �ƴϱ� ������ NumberFormatException�� �߻�
		//�Ʒ����� System.out.println("try"); �� �ǳʶٰ� catch������ ���� �ȴ�
		//finally�� try�� ������ �ݵ�� ����ǹǷ� System.out.println("finally"); ��µ�
		//catch�� return�� �������Ƿ� System.out.println("continue running");�� ����ȴ�
	}
}
