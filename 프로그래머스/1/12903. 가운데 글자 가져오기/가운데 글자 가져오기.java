class Solution {
public String solution(String s) {
        
        int slength = s.length();
        String answer = "";
        
        if (slength % 2 == 0) {//짝수
            answer = s.substring((slength / 2) - 1, (slength / 2) + 1);
        }
        else { // 홀수
            answer = s.substring((slength / 2), (slength / 2) + 1);
        }
        
        return answer;
    }
}