//보건관리학과 20170809 홍은영

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("serial")
class ImproperArraySizeException extends Exception {
	public ImproperArraySizeException(String message) {super(message);}
}

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
	public T select() throws ImproperArraySizeException {
		ArrayList<T> temp = copyArray();
		
		if(temp == null || temp.size() == 0) {
			throw(new ImproperArraySizeException("입력된 원소가 없는 상태입니다."));
		}
		Collections.shuffle(temp);
		
		return temp.get(1);
	}
	
	//리스트의 내용 출력
	public void print() {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println();
	}

	private ArrayList<T> copyArray() {
		ArrayList<T> temp = new ArrayList<T>();
		temp = list;
		
		return temp;
	}
}
