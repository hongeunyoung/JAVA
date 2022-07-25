//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice70 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수형 RandomList를 생성합니다.");
		System.out.print("리스트의 크기를 입력하세요: ");
		int size1 = s.nextInt();
		
		RandomList<Integer> list1 = new RandomList<Integer>();

		for(int i = 0; i < size1; i++) {
			System.out.print("추가하고 싶은 정수를 입력하세요: ");
			list1.add(s.nextInt());
		}
		
		System.out.println("리스트의 내용을 출력합니다.");
		list1.print();
		System.out.println("무작위 원소 출력: " + list1.select());
		
		System.out.println();
		
		System.out.println("문자열 RandomList를 생성합니다.");
		System.out.print("리스트의 크기를 입력하세요: ");
		int size2 = s.nextInt();
		
		RandomList<String> list2 = new RandomList<String>();

		for(int i = 0; i < size2; i++) {
			System.out.print("추가하고 싶은 문자열을 입력하세요: ");
			list2.add(s.next());
		}
		
		s.close();
		
		System.out.println("리스트의 내용을 출력합니다.");
		list2.print();
		System.out.println("무작위 원소 출력: " + list2.select());
	}
}
