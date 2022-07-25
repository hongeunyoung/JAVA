import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] meeting = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			meeting[i][0] = Integer.parseInt(token.nextToken());
			meeting[i][1] = Integer.parseInt(token.nextToken());
		}
		
		Arrays.sort(meeting, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
		});
		
		int min = meeting[0][1];
		int count = 1;
		
		for(int i = 1; i < N; i++) {
			if(meeting[i][0] >= min) {
				min = meeting[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
}