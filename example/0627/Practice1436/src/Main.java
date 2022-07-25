import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int count = 1, answer = 666;
		
		while(count != N) {
			answer++;
			if(String.valueOf(answer).contains("666"))
				count++;
		}			
		
		System.out.println(answer);
	}
}
