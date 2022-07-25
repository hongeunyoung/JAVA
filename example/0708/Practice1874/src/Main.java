import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder answer = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int index = 1;
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(bf.readLine());
			
			for(int j = index; j <= num; j++) {
				if(num >= j) {
					stack.push(j);
					index++;
					answer.append("+\n");
				}
			}
			
			if(stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			answer.append("-\n");
		}
			
		System.out.println(answer);
	}

}
