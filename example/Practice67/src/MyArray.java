//���ǰ����а� 20170809 ȫ����

@SuppressWarnings("serial")
class OutOfRange extends Exception {
	public OutOfRange(String message) {super(message);}
}

public class MyArray {
	public static <T> T pick(T[] arr, int index) {
		if(index >= arr.length || index < 0) {
			System.out.print ("�ε����� ������ ������ϴ� >> ");
			return null;
		}
		
		return arr[index];
	}
	
	public static <T> T pickNew(T[] arr, int index) throws OutOfRange {
		if(index >= arr.length || index < 0) {
			throw (new OutOfRange("�ε����� ������ ������ϴ� >> null"));
		}
		
		return arr[index];
	}
	
	public static <T> void displayArray(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
	}
	
	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
