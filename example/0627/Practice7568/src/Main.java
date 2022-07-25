import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		int[] answer = new int[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine()," ");
			x[i] = Integer.parseInt(token.nextToken());
			y[i] = Integer.parseInt(token.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j)
					continue;
				
				if(x[j] < x[i] && y[j] < y[i])
					answer[j]++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print((answer[i] + 1) + " ");
		}
	}

}
