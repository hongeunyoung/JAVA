import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		int n, n3, count;
		
		for(int i = 0; i < T; i++) {
			n = Integer.parseInt(bf.readLine());
			n3 = n / 3;
			count = 0;
			
			for(int j = n3; j >= 0; j--)
				count += ((n - (3 * j)) / 2) + 1;
			
			System.out.println(count);
		}
	}
}