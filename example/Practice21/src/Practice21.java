//보건관리학과 20170809 홍은영

import java.util.Random;

public class Practice21 {

	public static void main(String[] args) {
		Random rg = new Random();
		int[] num = new int[10];
		int total = 0;
		double average = 0;
		
		// 배열 내용 변경이 일어나기 때문에 for each 불가능
		for(int i = 0; i < num.length; i++) {
			num[i] = rg.nextInt(101);
		}
		
		for(int value : num) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		
		// for each는 0번째부터 차례대로 처리하기 때문에 사용할 수 없다
		for(int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + "\t");
		}
		
		System.out.println();
		
		for(int value : num) {
			total += value;
		}
		
		System.out.println("난수들의 총합: " +  total);
		
		//String.format()을 사용하면 깔끔하게 나올 수 있다
		for(int value : num) {
			average += (double)value / num.length; 
		}
		
		System.out.println("난수들의 평균: " +  average);
	}
}
