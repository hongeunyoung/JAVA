//보건관리학과 20170809 홍은영

public class Practice24 {

	public static void main(String[] args) {
		int[][] intArray = {{1, 2, 3, 4}, {10, 20, 30, 40}, {100, 200, 300, 400}};
		int[] colSum = new int[4];
		int[] rowSum = new int[3];
		int total = 0;
		
		for(int i = 0; i < intArray.length + 1; i++) {
			if(i == intArray.length) {
				for(int j = 0; j < colSum.length + 1; j++) {
					if(j == colSum.length) {
						System.out.print(total);
					}
					else {
						System.out.print(colSum[j] + "\t");
					}
				}
			}
			else {
				for(int j = 0; j < intArray[i].length + 1; j++) {
					if(j == intArray[i].length) {
						System.out.print(rowSum[i] + "\t");
					}
					else {
						colSum[j] += intArray[i][j];
						rowSum[i] += intArray[i][j];
						total += intArray[i][j];
						System.out.print(intArray[i][j] + "\t");
					}
				}
			}
			
			System.out.println();
		}
	}
}
