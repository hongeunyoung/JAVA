//dfs: 모든 티켓을 다 탐색해야 하니까. 타고 타고 가는거라서 깊이 탐색이 맞을 것 같다

import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Solution {
    public void dfs(String[][] tickets, String path, String next, int index, boolean[] visited, String[] answer) {
        //끝까지 도달하면 answer에 답 저장하고 종료
        if(index == tickets.length + 1) {
            StringTokenizer token = new StringTokenizer(path, " ");
            for(int i = 0; i < index; i++)
                answer[i] = token.nextToken();
            return;
        }
        
        for(int i = 0; i < tickets.length; i++) {
            if(tickets[i][0].equals(next) && !visited[i]) {
                visited[i] = true;
                dfs(tickets, path + " " + tickets[i][1], tickets[i][1], index + 1, visited, answer);
                
                //만약 위의 과정에서 끝까지 도달하지 못했으면 알파벳 다음 순서의 항공권을 써야 하기 때문에 visited를 false로 변경
                if(answer[0] == null)
                    visited[i] = false;
            }
        }
    }
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        boolean[] visited = new boolean[tickets.length];
        
        //정렬
        Arrays.sort(tickets, new Comparator<String[]>() {
			
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }			
        });
        
        dfs(tickets, "ICN", "ICN", 1, visited, answer);
        
        return answer;
    }
}