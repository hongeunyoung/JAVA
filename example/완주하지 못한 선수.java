import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> h = new HashMap<>();
        
			//hashmap에 key에 participant 요소, value에 개수 저장
        for(String p : participant)
            h.put(p, h.getOrDefault(p, 0) + 1);
            
			//hashmap에 completion과 일치하는 key가 있으면 value-1
        for(String c : completion)
            h.put(c, h.get(c) - 1);
        
			//value가 0이 아닌 key 확인
        for(String key : h.keySet())
            if(h.get(key) != 0)
                answer = key;
        
        return answer;
    }
}