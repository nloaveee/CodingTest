class Solution {
        public int[] solution(int[] arr) {

            // 1
            for (int i = 0 ; i<arr.length; i++) {
                if(arr[i]>=50 && arr[i]%2 == 0) {
                    arr[i] = arr[i]/2;
                }else if (arr[i] <50 && arr[i] %2!=0){
                    arr[i]= arr[i]*2;
                }
            }
            return arr;



            // 2
//            int[] answer = new int [arr.length];
//
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] >= 50 && arr[i] % 2 == 0) {
//                    answer[i] = arr[i] / 2;
//                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
//                    answer[i] = arr[i] * 2;
//                } else {
//                    answer[i]=arr[i];
//                }
//            }
//            return answer;
        }
    }