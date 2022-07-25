//���ǰ����а� 20170809 ȫ����

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Practice80 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ ������ �Է��ϼ���: ");
		int n = s.nextInt();
		System.out.print("���� ���� ������ �����ϼ���: ");
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
			System.out.print("\n���� ���� ������ ���� �̸��� �Է��ϼ���: ");
			String name = s.next();
			PrintWriter pw = new PrintWriter(new FileWriter(name));
			
			for(int i = 0; i < n; i++) {
				pw.println(arr[i]);
			}
			
			System.out.println("���� " + name + "�� �������� ����Ǿ����ϴ�.");
			
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
