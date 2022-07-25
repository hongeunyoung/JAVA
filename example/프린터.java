import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //숫자가 클수록 우선순위를 갖는다
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : priorities)
            que.add(num);
        
        while(!que.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                //peek() : 우선순위큐에서 가장 우선 순위가 높은 것을 출력
                if(priorities[i] == que.peek()) {
                    answer++;
                    
                    if(i == location)
                        return answer;
                    
                    //가장 우선순위가 높은 것을 제거
                    que.remove();
                }
                
            }
        }
        
        return answer;
    }
}