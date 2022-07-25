import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        //x, y에 상하좌우 값을 더하기 위함
        int[] dx = {-1, 0, 1, 0}; // 상하
        int[] dy = {0, -1, 0, 1}; //좌우
        
        //map 만들기(2배)
        int[][] map = new int[101][101];
        
        //사각형을 1로 채움
        for(int i = 0; i < rectangle.length; i++)
            for(int x = rectangle[i][0] * 2; x <= rectangle[i][2] * 2; x++)
                for(int y = rectangle[i][1] * 2; y <= rectangle[i][3] * 2; y++)
                    map[x][y] = 1;
                    
        //안쪽을 0으로 채움
        for(int i = 0; i < rectangle.length; i++)
            for(int x = rectangle[i][0] * 2 + 1; x <= rectangle[i][2] * 2 - 1; x++)
                for(int y = rectangle[i][1] * 2 + 1; y <= rectangle[i][3] * 2 - 1; y++)
                    map[x][y] = 0;
        
        //방문한 좌표는 표시(true: 방문)
        boolean[][] visited = new boolean[101][101];
        int x = characterX * 2;
        int y = characterY * 2;
        Queue<Node> que = new LinkedList<>();
        //시작 노드
        que.offer(new Node(x, y, 0));
        
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == itemX * 2 && node.y == itemY * 2) {
                answer = node.cost / 2;
                break;
            }
            
            //4가지 방향 확인
            for(int i = 0; i < 4; i++) {
                x = node.x + dx[i];
                y = node.y + dy[i];
                
                if(x >= 0 && y >= 0 && x < map.length && y < map[0].length) {
                    if(!visited[x][y] && map[x][y] == 1) {
                        visited[x][y] = true;
                        que.offer(new Node(x, y, node.cost + 1));
                    }                        
                }
            }
        }
        
        return answer;
    }
    
    public class Node {
        int x;
        int y;
        int cost;
        
        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}