//���ǰ����а� 20170809 ȫ����

public class Practice23 {

	public static void main(String[] args) {
		int[][] intArray = {{1, 2, 3, 4}, {10, 20, 30, 40}, {100, 200, 300, 400}};
		int[] colSum = new int[4];
		
		System.out.println("�迭�� ���");
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				colSum[j] += intArray[i][j];
				System.out.print(intArray[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("�հ� �Բ� ���");
		
		for(int i = 0; i < intArray.length + 1; i++) {
			if(i == intArray.length) {
				for(int j = 0; j < colSum.length; j++) {
					System.out.print(colSum[j] + "\t");
				}
			}
			else {
				for(int j = 0; j < intArray[i].length; j++) {
					System.out.print(intArray[i][j] + "\t");
				}
			}
			
			System.out.println();
		}
	}
}
