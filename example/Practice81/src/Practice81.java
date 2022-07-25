//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;


public class Practice81 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.print("�������� ����� ���� �̸��� �Է��ϼ���: ");
			String name = s.next();
			Scanner scan = new Scanner(new FileReader(name));
			System.out.println("���Ͽ��� ������ �о� ���Դϴ�.");
			
			int count = 0;
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			while (scan.hasNext()) {
				list.add(scan.nextInt());
				count++;
			}
		
			System.out.println("������ ������ ��� " + count + "���Դϴ�.");
			
			System.out.println("�Էµ� ������ ������ �����ϴ�.");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "\t");
				
				if(i % 10 == 9) {
					System.out.println();
				}
			}
			
			Collections.sort(list);
			
			System.out.println("\n���ĵ� ������ ������ �����ϴ�.");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "\t");
				
				if(i % 10 == 9) {
					System.out.println();
				}
			}
			
			if (scan != null) {
				scan.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
	}
}
