//���ǰ����а� 20170809 ȫ����

import java.util.ArrayList;
import java.util.Random;

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
	public T select() {
		Random r = new Random();
		
		return list.get(r.nextInt(3));
	}
	
	//����Ʈ�� ���� ���
	public void print() {
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println();
	}

}
