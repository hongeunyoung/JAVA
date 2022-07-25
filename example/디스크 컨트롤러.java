import java.util.Arrays;
import java.util.PriorityQueue;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int count = 0;
        int now = 0;
        int i = 0;
        
        //jobs[i][0] 기준으로 jobs 정렬
        Arrays.sort(jobs, ((o1, o2) -> o1[0]-o2[0]));

        //jobs[i][1] 기준으로 숫자가 낮을수록 우선순위를 갖는 우선순위큐 정의
        PriorityQueue<int[]> que = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        
        //answer에 값을 더하는 횟수가 jobs 길이만큼 일어나도록 while 조건 설정 
        while(count < jobs.length) {
            //i가 jobs 길이보다 작고 소요 시간이 now 이하인 작업을 que에 저장한다
            while(i < jobs.length && jobs[i][0] <= now) {
                que.offer(jobs[i++]);
            }

            //que가 비어있다면 now를 jobs[i][0] 기준으로 정렬시킨 jobs의 i번째 값으로 설정한다
            if(que.isEmpty())
                now = jobs[i][0];
            //비어있지 않다면 que에서 가장 우선순위가 높은 값을 꺼내서 answer에 더한다
            else {
                int[] temp = que.poll();
                answer += temp[1] + now - temp[0];
                now += temp[1];
                count++;
            }
        }
	        
	        return answer/jobs.length;
    }
}