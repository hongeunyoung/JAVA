//보건관리학과 20170809 홍은영

import java.util.Random;

public class Practice19 {
	public static void main(String[] args) {
		Random rg = new Random();
		int[] num = new int[5];
		int index = 1;
		
		while(true)
		{
			System.out.println("(" + index + "차 실행)");
			
			for(int i = 0; i < num.length; i++) {
				num[i] = rg.nextInt(101);
			}
			
			printArray(num);
			
			if(searchArray(num, 100) != -1) {
				System.out.println("\n" + index + "차 실행에서 난수 100이 발생했으므로 프로그램을 종료합니다.");
				break;
			}
			
			index++;
		}
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
