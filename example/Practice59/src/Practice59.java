//보건관리학과 20170809 홍은영
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("serial")
class NotFoundException extends Exception {
	public NotFoundException(String message) {super(message);}
}

public class Practice59 {
	public static void errorCheck(int key, int index) throws NotFoundException {
		if(index == -1 ) {	
			throw (new NotFoundException("입력된 숫자 " + key + "는 배열에 존재하지 않습니다."));
		}
	}
	public static void main(String[] args) throws NotFoundException {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int key = 0;
		
		System.out.println("10개의 난수를 발생시켜서 배열에 저장합니다.");
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
			
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		System.out.print("숫자를 하나 입력하세요: ");
		
		key = s.nextInt();
		
		s.close();
		
		int index = searchArray(num, key);
		
		try {
			errorCheck(key, index);
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.println("입력된 숫자 " + key + "는 인덱스 " + index + "번에 존재합니다.");
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
