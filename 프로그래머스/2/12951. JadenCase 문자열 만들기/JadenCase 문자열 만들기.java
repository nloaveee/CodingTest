class Solution {
    public String solution(String s) {
         StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i =0; i< arr.length; i++) {

            if (arr[i].isEmpty()) answer.append(" ");
            else {
                answer.append(arr[i].substring(0, 1).toUpperCase());
                answer.append(arr[i].substring(1, arr[i].length()).toLowerCase());
                answer.append(" ");
            }
        }

        if (s.substring(s.length()-1, s.length()).equals(" "))
            return answer.toString();

        return answer.substring(0, answer.length()-1);
    }
}