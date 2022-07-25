//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;

public class Practice57C {
	public static void main(String[] args) {
		int[] iArray = new int[0];
		
		try {
			iArray = getInput();
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ������ �����Դϴ�.");
		}
		
		for(int i = 0; i < iArray.length; i++) {
			iArray[i] = i * 20;
		}
		
		for(int x: iArray) {
			System.out.print(x + "\t");
		}
	}
	
	public static int[] getInput() throws NumberFormatException {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���: ");
		String str = s.next();
			
		int num = Integer.parseInt(str);
			
		int[] rslt = makeArray(num);
			
		s.close();
		
		return rslt;
	}
	
	public static int[] makeArray(int size) {
		int[] rslt = new int[0];
		
		try {
			rslt = new int[size];
		} catch (NegativeArraySizeException e) {
			System.out.println("�迭�� ũ�Ⱑ �����Դϴ�.");
		} 
		
		return rslt;
	}
}
