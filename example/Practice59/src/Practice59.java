//���ǰ����а� 20170809 ȫ����
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("serial")
class NotFoundException extends Exception {
	public NotFoundException(String message) {super(message);}
}

public class Practice59 {
	public static void errorCheck(int key, int index) throws NotFoundException {
		if(index == -1 ) {	
			throw (new NotFoundException("�Էµ� ���� " + key + "�� �迭�� �������� �ʽ��ϴ�."));
		}
	}
	public static void main(String[] args) throws NotFoundException {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int key = 0;
		
		System.out.println("10���� ������ �߻����Ѽ� �迭�� �����մϴ�.");
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
			
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���: ");
		
		key = s.nextInt();
		
		s.close();
		
		int index = searchArray(num, key);
		
		try {
			errorCheck(key, index);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("�Էµ� ���� " + key + "�� �ε��� " + index + "���� �����մϴ�.");
	}

	public static int searchArray(int[] array, int key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
}
