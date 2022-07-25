//양심 고백합니다. 이건 그냥 답 보면서 공부했습니다.
//dfs로 풀다가 bfs로 푼 사람이 많더라구요. 
//dfs가 구현이 더 쉬워서 다들 그냥 이런 문제 보면 dfs로 먼저 한다고 합니다.
//(https://geunzrial.tistory.com/115 여기서 볼 수 있는 코드 길이 차이)
//하지만 효율성에서 걸리니까 특징 없는 최단 거리 문제는 반드시 bfs로 풀기로 약속~
//시간복잡도는 둘 다 같지만, dfs는 처음으로 발견되는 해답이 최단거리가 아닐 수 있습니다.
//그러나 bfs는 현재 노드에서 가까운 곳부터 찾아서 
//경로 탐색 시 먼저 찾아지는 해답이 곧 최단거리기 때문에 효율성이 더 좋습니다.

import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        //x, y에 상하좌우 값을 더하기 위함
        int[] dx = {-1, 0, 1, 0}; // 상하
        int[] dy = {0, -1, 0, 1}; //좌우
        //방문한 좌표는 표시(true: 방문)
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int x = 0;
        int y = 0;
        Queue<Node> que = new LinkedList<>();
        //시작 노드
        que.offer(new Node(x, y, 1));
        
        while(!que.isEmpty()) {
            Node node = que.poll();
            if(node.x == maps.length - 1 && node.y == maps[0].length - 1)
                answer = node.cost;
            
            //4가지 방향 확인
            for(int i = 0; i < 4; i++) {
                x = node.x + dx[i];
                y = node.y + dy[i];
                
                if(x >= 0 && y >= 0 && x < maps.length && y < maps[0].length) {
                    if(!visited[x][y] && maps[x][y] == 1) {
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