//보건관리학과 20170809 홍은영

public class Practice06 {

	public static void main(String[] args) {		
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 6; j++) {
				for(int k = 2; k < 6; k++) {
					System.out.print((i * 4) + k + " * " + j +" = " + (((i * 4) + k) * j) + "\t");		
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}
