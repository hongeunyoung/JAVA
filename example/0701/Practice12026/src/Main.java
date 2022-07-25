import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
	public static int solution(int n, int k, int[][] a, int[] w, int[] v) {
		if (n < 0)
			return 0;
		
		if (a[n][k] == 0) {
			if(w[n] > k)
				a[n][k] = solution(n - 1, k, a, w, v);
			else 
				a[n][k] = Math.max(solution(n - 1, k, a, w, v), solution(n - 1, k - w[n], a, w, v) + v[n]);
		}
		
		return a[n][k];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		int[][] answer = new int[N][K + 1];
		int[] W = new int[N];
		int[] V = new int[N];
 
		for (int i = 0; i < N; i++) {
			token = new StringTokenizer(bf.readLine(), " ");
			W[i] = Integer.parseInt(token.nextToken());
			V[i] = Integer.parseInt(token.nextToken());
		}
 
		System.out.println(solution(N - 1, K, answer, W, V));
 
	}
}