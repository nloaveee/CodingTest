class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;

        for (String str : arr) {
            if (str.contains(" ")) {
                cnt = 0;
            } else {
                cnt++;
            }

            if (cnt % 2 == 0) {
                answer += str.toLowerCase();
            } else {
                answer += str.toUpperCase();
            }
        }
        return answer;
    }
}