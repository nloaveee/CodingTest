class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int gcd = getGcd(n,m);
        int lcm = (n*m) / gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
    
    public static int getGcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } 
        
        return getGcd(m, n%m);
    }
}