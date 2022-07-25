//배열로 풀었더니 효율성에서 실패해서 해시 코드만 올려요

import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> set = new HashSet<String>();

        for (String num : phone_book) 
            set.add(num);
        
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (set.contains(phone_book[i].substring(0, j)))
                    return false;

        return answer;
    }
}