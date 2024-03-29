 class Solution {
        public int solution(int[] num_list) {
            
            // 1)
//            int sum = 0;
//            int mul = 1;
//            for (int i = 0; i < num_list.length; i++) {
//                if (num_list.length >= 11) {
//                    sum += num_list[i];
//                }else {
//                    mul *= num_list[i];
//                }
//            }
//            return num_list.length >= 11 ? sum : mul;


            // 2)
            // 또 다른 변수를 만들 필요가 없다.
            int answer = (num_list.length < 11 ? 1 : 0);

            for (int i = 0; i < num_list.length; i++) {
                if (num_list.length < 11) {
                    answer *= num_list[i];
                } else {
                    answer += num_list[i];
                }
            }
            return answer;
        }
    }