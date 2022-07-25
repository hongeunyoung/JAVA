//상하좌우길래 그냥 큐 썼는데 값이 자꾸 틀려서 그냥 재귀로 바꿨답니다
//사실 구조는 똑같은데 왜 그러는지 알수가 없네요?!?! 아는 천재한결싀 구함

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine()," ");
		int M = Integer.parseInt(token.nextToken());
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		int[][] map = new int[N][M];
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		//map 만들기
		for(int i = 0; i < K; i++) {
			token = new StringTokenizer(bf.readLine()," ");
			int x1 = Integer.parseInt(token.nextToken());
			int y1 = Integer.parseInt(token.nextToken());
			int x2 = Integer.parseInt(token.nextToken());
			int y2 = Integer.parseInt(token.nextToken());
			
			for(int j = x1; j < x2; j++)
				for(int k = y1; k < y2; k++)
					map[j][k] = 1;
		}		

		//영역 탐색
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					count = 0;
					dfs(i, j, map, N, M);
					list.add(count);
				}
			}
		}					
        
		//list의 크기가 곧 영역 개수!!!
        System.out.println(list.size());
        //정렬
        Collections.sort(list);
        for (Integer li : list) {
            System.out.print(li + " ");
        }
	}
	
	public static void dfs(int i, int j, int[][] map, int N, int M) {
		//x, y에 상하좌우 값을 더하기 위함
        int[] dx = {-1, 0, 1, 0}; // 상하
        int[] dy = {0, -1, 0, 1}; //좌우
        
		map[i][j] = 1;
		count++;
		
		for(int a = 0; a < 4; a++) {
			int x = i + dx[a];
			int y = j + dy[a];
			
			if(x >= 0 && y >= 0 && x < N && y < M && map[x][y] == 0)
				dfs(x, y, map, N, M);
		}
	}
}