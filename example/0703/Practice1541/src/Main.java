import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), "-");
		String[] plus = new String[50];
		int sum, min = 0;
		
		for(int i = 0; token.hasMoreTokens(); i++) 
			plus[i] = token.nextToken();
		
		for(int i = 0; plus[i] != null; i++) {
			StringTokenizer temp = new StringTokenizer(plus[i], "+");
			
			sum = 0;
			while(temp.hasMoreTokens()) {
				sum += Integer.parseInt(temp.nextToken());
			}
			
			if(i == 0)
				min += sum;
			else
				min -= sum;
		}
		
		System.out.println(min);
	}
}