//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

public class Practice20 {
	public static void main(String[] args) {
		Random rg = new Random();
		int[] num = new int[3];
		int[] select = new int[3];
		int sameValue= 0, samePosition = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = rg.nextInt(9) + 1;
		}
		
		printArray(num);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < select.length; i++) {
			System.out.print(i + "��° ���� �Է�: ");
			select[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 0; i < select.length; i++) {
			if(select[i] == num[i]) {
				samePosition++;
			}
			else if(searchArray(num, select[i]) != -1) {
				sameValue++;
			}
		}
		
		System.out.println("�ڸ��� ���� ��� ���� ����: " + samePosition);
		System.out.println("�ڸ��� �ٸ��� ���� ���� ����: " + sameValue);
	}
	
	public static int searchArray(int[] array, int key) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		
		return -1;
	}

	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println();
	}
}
