import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
 
public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		int[] people = new int[N];
		int count = 0;
		
		for(int i = 0; i < N; i++)
			people[i] = Integer.parseInt(token.nextToken());
		
		Arrays.sort(people);
		
		for(int i = 0; i < N; i++)
			count += (people[i] * (N - i));
		
		System.out.println(count);		
	}
}