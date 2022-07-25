//���ǰ����а� 20170809 ȫ����

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("serial")
class ImproperArraySizeException extends Exception {
	public ImproperArraySizeException(String message) {super(message);}
}

public class RandomList<T> {
	ArrayList<T> list;
	
	//������
	public RandomList() {
		list = new ArrayList<T>();
	}
	
	//����Ʈ�� ���� �߰�
	public void add(T item) {
		list.add(item);
	}
	
	//�����ϰ� �ϳ��� ���Ҹ� �����Ͽ� ��ȯ
	public T select() throws ImproperArraySizeException {
		ArrayList<T> temp = copyArray();
		
		if(temp == null || temp.size() == 0) {
			throw(new ImproperArraySizeException("�Էµ� ���Ұ� ���� �����Դϴ�."));
		}
		Collections.shuffle(temp);
		
		return temp.get(1);
	}
	
	//����Ʈ�� ���� ���
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
