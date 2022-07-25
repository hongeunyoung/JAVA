//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice65 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: ");
		String s1 = s.next();
		System.out.print("두번째 원소를 입력하세요: ");
		String s2 = s.next();
		
		MyPair<String> m1 = new MyPair<String>(s1, s2);
		
		System.out.println("만들어진 순서쌍: " + m1.toString() + "\n");
		
		System.out.println("숫자로 이루어진 순서쌍을 만듭니다.");
		System.out.print("첫번째 원소를 입력하세요: ");
		int n1 = s.nextInt();
		System.out.print("두번째 원소를 입력하세요: ");
		int n2 = s.nextInt();
		
		MyPair<Integer> m2 = new MyPair<Integer>(n1, n2);
		
		System.out.println("만들어진 순서쌍: " + m2.toString());
		
		s.close();		
	}
}
