//덱으로 풀었어요

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Collections;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        LinkedList<Integer> deq = new LinkedList<>();
        
        for(int i = 0; i < operations.length; i++) {
						//공백 기준으로 operations[i] 자르기
            StringTokenizer token = new StringTokenizer(operations[i], " ");
            
            if(token.nextToken().equals("I")) {
                deq.add(Integer.parseInt(token.nextToken()));
								//정렬
                Collections.sort(deq, (o1, o2) -> {return o1 - o2;});
            }                
            else if(operations[i].equals("D 1"))
                deq.pollLast();
            else
                deq.poll();           
        }
        
        if(!deq.isEmpty()) {
            answer[0] = deq.peekLast();
            answer[1] = deq.peek();
        }
        return answer;
    }
}