//bfs: begin -> target으로의 최단 거리를 구하기 때문
//Node: 단어, cost
//근데 서치해보니까 왤케 다들 dfs로 푼거져..? 
//프로그래머스 좋아요 많은 답안은 bfs던데
//둘 중 뭐로 풀어도 상관없는 문제인가 봅니다

import java.util.Queue;
import java.util.LinkedList;

class Solution {    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(begin, 0));
        
        while(!que.isEmpty()) {
            Node node = que.poll();
						//target과 같아지면 answer에 답 저장하고 반복문 종료
            if(node.word.equals(target)) {
                answer = node.cost;
                break;
            }
            
						//begin을 갱신해준다
            begin = node.word;
            for(int i = 0; i < words.length; i++) {
                int count = 0;
								//begin과 한개만 다른 것을 queue에 저장
                for(int j = 0; j < begin.length(); j++)
										//charAt(n): String 변수에서 n 자리에 있는 것을 반환
                    if(begin.charAt(j) == words[i].charAt(j))
                        count++;
                
                if(count == words[i].length() - 1 && !visited[i]) {
                    que.offer(new Node(words[i], node.cost + 1));
                    visited[i] = true;
                }
            }
        }
        
        return answer;
    }
    
    public class Node {
        String word;
        int cost;
        
        public Node(String word, int cost) {
            this.word = word;
            this.cost = cost;
        }
    }
}