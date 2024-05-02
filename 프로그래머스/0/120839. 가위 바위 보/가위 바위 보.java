class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] charRsp = new char[rsp.length()];
        for (int i = 0; i < rsp.length(); i++) {
            charRsp[i] = rsp.charAt(i);
            if (charRsp[i] == '2') {
                answer += "0";
            } else if (charRsp[i] == '0') {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}


