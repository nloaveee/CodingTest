class Solution {
        public String solution(String rny_string) {
            String answer = "";
            for (int i = 0; i < rny_string.length(); i++) {
                if (rny_string.contains("m")) {
                    answer = rny_string.replace("m", "rn");
                }
                if (!rny_string.contains("m")) {
                    return rny_string;
                }
            }
            return answer;
        }
    }