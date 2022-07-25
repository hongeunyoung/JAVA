import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //우선순위큐(숫자가 낮을수록 우선순위가 높음)
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        //que에 scoville값 넣기
        for(int i = 0; i < scoville.length; i++)
            que.offer(scoville[i]);
        
        //우선순위가 가장 높은 값이(가장 작은 값이) K 이상이면 반복문을 끝낸다
        while(que.peek() < K) {
            //que size가 2보다 작을 때, 그 값이 K보다 작으면 -1 return
            if(que.size() < 2)
                return -1;
            
            int sco = que.poll() + (que.poll() * 2);
            que.offer(sco);
            answer++;
        }
        
        return answer;
    }
}