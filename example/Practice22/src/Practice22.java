//���ǰ����а� 20170809 ȫ����

import java.util.Scanner;
import java.util.Random;

public class Practice22 {
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
		int index = 0;
		
		for(int value : array) {
			if(value == key) {
				return index;
			}
			
			index++;
		}
		
		return -1;
	}

	public static void printArray(int[] array) {
		for(int value : array) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
	}
}
