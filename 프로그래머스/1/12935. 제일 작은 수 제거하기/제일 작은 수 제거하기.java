import java.util.*;

class Solution {
        public int[] solution(int[] arr) {

            if(arr.length==1){
                int[] answer_one={-1};
                return answer_one;
            }

            int[] answer = new int[arr.length-1];

            int min=arr[0];
            for(int i=1; i<arr.length; i++){
                min=Math.min(min,arr[i]);
            }

            int cnt=0;
            for(int i =0; i<arr.length; i++){
                if(min==arr[i]){
                    continue;
                }
                answer[cnt++]=arr[i];
            }
            return answer;
        }
    }