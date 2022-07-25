//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

public class Practice18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rg = new Random();
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = rg.nextInt(101);
		}
		
		printArray(num);
		
		System.out.print("ã�� ���� ���ڸ� �Է��ϼ���: ");
		int key = sc.nextInt();
		
		int index = searchArray(num, key);
		
		if(index != -1) {
			System.out.println("�Է��� ���� " + key + "�� �迭�� " + index + "�� �ڸ��� �ֽ��ϴ�.");
		}
		else {
			System.out.println("�Է��� ���� " + key + "�� �迭�� �����ϴ�.");
		}
		
		sc.close();
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
