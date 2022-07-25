//º¸°Ç°ü¸®ÇÐ°ú 20170809 È«Àº¿µ

@SuppressWarnings("serial")
class OutOfRange extends Exception {
	public OutOfRange(String message) {super(message);}
}

public class MyArray {
	public static <T> T pick(T[] arr, int index) {
		if(index >= arr.length || index < 0) {
			System.out.print ("ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù >> ");
			return null;
		}
		
		return arr[index];
	}
	
	public static <T> T pickNew(T[] arr, int index) throws OutOfRange {
		if(index >= arr.length || index < 0) {
			throw (new OutOfRange("ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù >> null"));
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
