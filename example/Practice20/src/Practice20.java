//보건관리학과 20170809 홍은영

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
			System.out.print(i + "번째 숫자 입력: ");
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
		
		System.out.println("자리와 값이 모두 같은 숫자: " + samePosition);
		System.out.println("자리는 다르고 값만 같은 숫자: " + sameValue);
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
