
       class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 1; i<=n; i+=2){
                if(n%i==0){
                    answer++;
                }
            }
            return answer;
        }
    }

    


//    public static void main(String[] args) {
//        System.out.println(solution(15));
//    }
//        public static int solution(int n) {
//
//            int cnt=0;
//            for(int i=1; i<=n; i++){
//                int sum=0;
//                for(int j=i; j<=n;j++){
//                    sum+=j;
//                    if(sum == n){
//                        cnt++;
//                        continue;
//                    }
//                }
//            }
//            return cnt;
//        }
