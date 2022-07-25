//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice67 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] sArray = {"하나", "두울", "세엣"};
		Integer[] iArray = {10, 20, 30, 40};
		
		System.out.println("문자열 배열의 내용입니다.");
		MyArray.<String>displayArray(sArray);
		
		int index;
		for(int i = 0; i < 2; i++) {
			System.out.print("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
			index = s.nextInt();
			
			System.out.print(index + "번 인덱스 저장 내용 : ");
			
			try { 
				System.out.println(MyArray.pickNew(sArray, index));
			} catch (OutOfRange e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.print("\n0번 인덱스에 저장된 값과 교환하고 싶은 인덱스를 선택하세요: ");
		MyArray.swap(sArray, 0, s.nextInt());
		System.out.println("변경 후 문자열 배열");
		MyArray.displayArray(sArray);
		
		System.out.println("정수형 배열의 내용입니다.");
		MyArray.<Integer>displayArray(iArray);
		
		System.out.println();
		
		for(int i = 0; i < 2; i++) {
			System.out.print("정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
			index = s.nextInt();
			
			System.out.print(index + "번 인덱스 저장 내용 : ");
			
			try { 
				System.out.println(MyArray.pickNew(iArray, index));
			} catch (OutOfRange e) {
				System.out.println(e.getMessage());
			}
		}
		
		s.close();
	}
}
