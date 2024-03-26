 class Solution {
        public int solution(int[] num_list) {
            //1.
//             int multiply = 1;
//             int sum = 0;
            
//            for (int i = 0 ; i < num_list.length; i++){
//                multiply *= num_list[i];
//                sum = sum + num_list[i];
//            }
//            sum = (sum*sum);
//            if (multiply < sum) {
//                return 1;
//            }else {
//                return 0;
//            }
            
            //2. 
             int mul = 1;
            int sum = 0;
            
            for (int i = 0 ; i <num_list.length; i++){
                sum += num_list[i];
                mul *= num_list[i];
            }
            
            return mul < Math.pow(sum,2) ? 1:0;
            
        }
    }