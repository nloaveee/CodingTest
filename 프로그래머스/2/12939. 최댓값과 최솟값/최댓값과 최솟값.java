class Solution {
    public String solution(String s) {

        String[] sArr = s.split(" ");
        int[] arr = new int[sArr.length];
        String answer = "";

        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        answer = min + " " + max;

        return answer;
    }
}