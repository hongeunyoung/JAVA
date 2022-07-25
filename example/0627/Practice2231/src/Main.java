import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static int solution(int n) {
		if(n < 10)
			return n;
		
		System.out.println("aa" + n);
		return (n % 10) + solution(n / 10);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		for(int i = 1; i < N; i++) {
			if(i + solution(i) == N) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
