class Solution {
    public int solution(int[] a, int[] b) {
        int mul = 0;
        int answer = 0;
        
        for (int i = 0; i < a.length; i++) {
            mul = a[i] * b[i];
            answer += mul;
        }
        
        return answer;
    }
}