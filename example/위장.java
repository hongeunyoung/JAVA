import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> h = new HashMap<>();
        
				//hashmap<종류, 개수> 저장
        for(int i = 0; i < clothes.length; i++)
            h.put(clothes[i][1], h.getOrDefault(clothes[i][1], 0) + 1);
            
				//종류별로 하나를 고르거나 하나도 안 고르는 경우를 구한다
        for(String s : h.keySet())
            answer *= (h.get(s) + 1);
            
				//안 고르는 경우를 없애고 return
        return answer - 1;
    }
}