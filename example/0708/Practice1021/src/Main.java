import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		LinkedList<Integer> deq = new LinkedList<>();
		int count = 0;
		
		for(int i = 1; i <= N; i++)
			deq.add(i);
		
		token = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(token.nextToken());
			
			if(deq.peek() == num) {
				deq.remove();
				continue;
			}
			
			if(deq.indexOf(num) <= deq.size() / 2) {
				while(deq.peek() != num) {
					deq.add(deq.poll());
					count++;
				}
			}
			else {
				while(deq.peek() != num) {
					deq.offerFirst(deq.pollLast());
					count++;
				}
			}
			
			deq.remove();
		}
		
		System.out.println(count);
	}
}