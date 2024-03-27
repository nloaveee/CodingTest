class Solution {
        public String solution(int[] numLog) {
            
            //1. 
//            String answer = "";
//            for (int i = 1; i < numLog.length; i++) {
//                if (numLog[i] - numLog[i-1] == 1) {
//                    answer += "w";
//                } else if (numLog[i] - numLog[i-1] == -1){
//                    answer += "s";
//                } else if (numLog[i] - numLog[i-1] == 10){
//                    answer += "d";
//                } else if (numLog[i] - numLog[i-1] == -10){
//                    answer += "a";
//                }
//            }
//            return answer;
//        }

            
            //2.
            String answer = "";
            for (int i = 1; i < numLog.length; i++) {
                // 
                int j = numLog[i - 1] - numLog[i];

                switch (j) {
                    case -1:
                        answer += "w";
                        break;
                    case 1:
                        answer += "s";
                        break;
                    case -10:
                        answer += "d";
                        break;
                    case 10:
                        answer += "a";
                        break;
                }
            }

            return answer;
        }
    }