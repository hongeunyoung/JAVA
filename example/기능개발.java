import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        int index, count, i, j;
        
        for(i = 0; i < progresses.length; i++) {
            count = 0;
            index = i - 1;
            
            for(j = 0; j < progresses.length; j++)
                progresses[j] += speeds[j];
                
            if(progresses[i] >= 100) {
                count++;
                index++;
                for(j = (i + 1); j < progresses.length; j++) {
                    if(progresses[j] < 100)
                        break;
                    else {
                        count++;
                        index = j;
                    }
                }
                temp.add(count);
            }
            i = index;                
        }
        
        answer = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}