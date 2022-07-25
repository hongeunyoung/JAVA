//보건관리학과 20170809 홍은영

import java.util.Random;
public class Practice17 {
	public static void main(String[] args) {
		Random rg = new Random();
		int[] num = new int[10];
		int total = 0;
		double average = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = rg.nextInt(101);
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		for(int i = 9; i >= 0; i--) {
			System.out.print(num[i] + "\t");
		}
		
		for(int i = 0; i < num.length; i++) {
			total += num[i];
		}
		
		System.out.println("\n난수들의 총합: " + total);
		
		for(int i = 0; i < num.length; i++) {
			average += (double)num[i] / num.length; 
		}
		
		System.out.println("난수들의 평균: " + average);
	}
}
