//보건관리학과 20170809 홍은영

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
	ArrayList<T> list;
	
	//생성자
	public RandomList() {
		list = new ArrayList<T>();
	}
	
	//리스트에 원소 추가
	public void add(T item) {
		list.add(item);
	}
	
	//랜덤하게 하나의 원소를 선택하여 반환
	public T select() {
		Random r = new Random();
		
		return list.get(r.nextInt(3));
	}
	
	//리스트의 내용 출력
	public void print() {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println();
	}

}
