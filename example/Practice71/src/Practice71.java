//보건관리학과 20170809 홍은영

import java.util.ArrayList;
import java.util.Random;

public class Practice71 {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
		Random r = new Random();
		
		double num;
		for(int i = 0; i < 10; i++) {
			do {
				num = r.nextDouble() * 11;
				//num = Math.random() * 10;
			} while(num > 10.0);
				
			list.add(num);
		}
		
		System.out.println("심사위원 채점결과");
		
		for(int i  = 0; i < 10; i++) {
			System.out.print(list.get(i) + "\t");
			
			if(i % 2 == 1) {
				System.out.println();
			}
		}
		
		System.out.println("\n평균값: " + getAve(list) + "\n");
		
		System.out.println("가장 높은 점수: " + findMax(list));
		System.out.println("가장 낮은 점수: " + findMin(list) + "\n");
		
		System.out.println("최고점과 최저점을 제외한 결과");
		
		for(int i  = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			
			if(i % 2 == 1) {
				System.out.println();
			}
		}
		
		System.out.println("\n최종 점수: " + getAve(list));
	}
	
	public static Double findMax(ArrayList<Double> scores) {
		double max = scores.get(0);
		int maxIndex = 0;
		
		for(int i = 1; i < scores.size(); i++) {
			if(max < scores.get(i)) {
				max = scores.get(i);
				maxIndex = i;
			}
		}
		
		scores.remove(maxIndex);
		
		return max;
	}
	
	public static Double findMin(ArrayList<Double> scores) {
		double min = scores.get(0);
		int minIndex = 0;
		
		for(int i = 1; i < scores.size(); i++) {
			if(min > scores.get(i)) {
				min = scores.get(i);
				minIndex = i;
			}
		}
		
		scores.remove(minIndex);
		
		return min;
	}
	
	public static Double getAve(ArrayList<Double> scores) {
		double avg = 0;
		
		for(int i = 0; i < scores.size(); i++) {
			avg += scores.get(i) / scores.size();
		}
		
		return avg;
	}
}
