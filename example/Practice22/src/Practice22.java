//보건관리학과 20170809 홍은영

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
		
		System.out.print("찾고 싶은 숫자를 입력하세요: ");
		int key = sc.nextInt();
		
		int index = searchArray(num, key);
		
		if(index != -1) {
			System.out.println("입력한 숫자 " + key + "는 배열의 " + index + "번 자리에 있습니다.");
		}
		else {
			System.out.println("입력한 숫자 " + key + "는 배열에 없습니다.");
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
