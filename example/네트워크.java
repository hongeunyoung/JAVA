//bfs 인 줄 알고 큐 불러오고 난리가 났네요
//근데 뭔가 계속 꼬이고 안되길래 그냥 재귀 쓰면 될 것 같단 생각이 갑자기 들더라구요
//그랬더니 진짜 됨.. 재귀면 dfs 문제..
//다 풀고나니 왜 dfs인지 알 것 같네요 완전 바보인듯

class Solution {
    public int dfs(int[][] computers, int i, int[] visited) {
        visited[i] = 1; 
        
        for(int j = 0; j < computers.length; j++)
            if(computers[i][j] == 1 && visited[j] == 0)
                visited[j] = dfs(computers, j, visited);
        
        return 1;
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[computers.length];
        
        for(int i = 0; i < computers.length; i++)
            if(visited[i] == 0)
                answer += dfs(computers, i, visited);
        
        return answer;
    }
}