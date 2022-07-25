
public class generic {
	public static Integer getLast(Integer[] a) {
		return a[a.length - 1];
	}
	
	public static String getLast(String[] a) {
		return a[a.length - 1];
	}
	
	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.print(element + "\t" );
		}
		
		System.out.println();
	}
}
