class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a;
        String[] arr = String.valueOf(x).split("");

        for (int i = 0; i<arr.length; i++) {
             a = Integer.parseInt(arr[i]);
            sum += a;
        }

        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}