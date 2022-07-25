//보건관리학과 20170809 홍은영

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
