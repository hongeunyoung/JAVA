//보건관리학과 20170809 홍은영

import java.util.Scanner;

public class Practice64 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//하늘
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		MyBox<String> m1 = new MyBox<String>(s.next());
		
		System.out.println("MyBox에 저장된 내용: " + m1.get());
		
		//바다
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		m1.set(s.next());
		
		System.out.println("MyBox에 저장된 내용: " + m1.get());
		
		//123
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		Integer i1 = s.nextInt();
		
		MyBox<Integer> m2 = new MyBox<Integer>(i1);
		
		//456
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		Integer i2 = s.nextInt();
		
		MyBox<Integer> m3 = new MyBox<Integer>(i2);
		
		//m2 + m3
		System.out.println(m2.get() + " + " + m3.get() + " = " + (m2.get() + m3.get()));
		
		s.close();
	}
}
