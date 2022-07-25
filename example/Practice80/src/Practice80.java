//보건관리학과 20170809 홍은영

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Practice80 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.print("원하는 난수의 개수를 입력하세요: ");
		int n = s.nextInt();
		System.out.print("난수 값의 범위를 설정하세요: ");
		int range = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = r.nextInt(range + 1);
			System.out.print(arr[i] + "\t");
			
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		try {
			System.out.print("\n난수 값을 저장할 파일 이름을 입력하세요: ");
			String name = s.next();
			PrintWriter pw = new PrintWriter(new FileWriter(name));
			
			for(int i = 0; i < n; i++) {
				pw.println(arr[i]);
			}
			
			System.out.println("파일 " + name + "에 난수값이 저장되었습니다.");
			
			if (pw != null) {
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
