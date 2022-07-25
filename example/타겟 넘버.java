//원래 dfs 함수를 int가 아니라 void로 해서 풀었는데
//다른 사람 풀이 보니까 이게 더 맘에 들어서 쌔벼왔습니다
//풀이 과정 자체는 같아요

class Solution {
    public int dfs(int[]numbers, int target, int sum, int index) {
        if(index == numbers.length) {
            if(sum == target)
                return 1;
            else
                return 0;
        }
        
        return dfs(numbers, target, sum + numbers[index], index + 1) + dfs(numbers, target, sum - numbers[index], index + 1);
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);
        return answer;
    }
}