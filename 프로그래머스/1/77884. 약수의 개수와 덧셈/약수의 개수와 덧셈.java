import java.util.*;
class Solution {
        public int solution(int left, int right) {
            int answer = 0;
            for (int i = left; i <= right; i++) {
                if (i % Math.sqrt(i) == 0) { //제곱수의 경우 홀수
                    answer -= i;
                } else { // 아닌 경우 짝수
                    answer += i;
                }
            }
            return answer;

        }
    }


    /*class Solution {
        public int solution(int left, int right) {

            int sum=0;
            for(int i = left; i <=right; i++){
                int count=0;
                for (int j=1; j<=i; j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count%2!=0){
                    sum-=i;
                } else {
                    sum+=i;
                }
            }
            return sum;
        }
    }*/
