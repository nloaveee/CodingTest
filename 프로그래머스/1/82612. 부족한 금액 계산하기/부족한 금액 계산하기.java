class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = 0;
        long answer;
        
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        answer = sum - money;
        
        if (answer <= 0) {
            return 0;
        }
        
        return answer;
        
    }
}