class Solution {
    public String solution(String s, int n) {
        
    String answer = "";
    char[] arr = s.toCharArray();

    for (int i = 0; i < arr.length; i++) {
        // 공백 처리
        if (arr[i] == ' ') {
            answer += " ";
            continue;
        }

        // 대문자와 소문자를 구분하여 처리
        if (Character.isUpperCase(arr[i])) {
            // 'A'부터 시작하는 대문자 처리
            answer += (char) ((arr[i] - 'A' + n) % 26 + 'A');
        } else if (Character.isLowerCase(arr[i])) {
            // 'a'부터 시작하는 소문자 처리
            answer += (char) ((arr[i] - 'a' + n) % 26 + 'a');
        }
    }

    return answer;
    }
}