import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine()," ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		char[][] board = new char[N][M];
		int answer = 64;
		int position, count;
		char temp;
		
		for(int i = 0; i < N; i++)
			board[i] = bf.readLine().toCharArray();
		
		for(int i = 0; i <= (N - 8); i++) {
			for(int j = 0; j <= (M - 8); j++) {
				temp = board[i][j];
				position = (i + j) % 2;
				
				count = 0;
				
				for(int k = i; k < (8 + i); k++) {
					for(int l = j; l < (8 + j); l++) {
						if(position == ((k + l) % 2) && temp != board[k][l])
								count++;
						
						if(position != ((k + l) % 2) && temp == board[k][l])
								count++;
					}
				}

				if(count < answer)
					answer = count;
				
				count = 0;
				
				for(int k = i; k < (8 + i); k++) {
					for(int l = j; l < (8 + j); l++) {
						if(position != ((k + l) % 2) && temp != board[k][l])
								count++;
						
						if(position == ((k + l) % 2) && temp == board[k][l])
								count++;
					}
				}

				if(count < answer)
					answer = count;
			}
		}
		
		System.out.println(answer);
	}

}
