class Solution {
        public int solution(int a, int b) {
//             int answer = 0;
            
//             // a,b를 문자열로 형변환을 해서 a+b 연산을 한 뒤, 다시 정수로 저장
//             answer = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
//             if (answer > (2*a*b)) {
//                 return answer;
//             }else{
//                 return 2*a*b;
//             }
            
            int sum = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
            int multiply = 2*a*b;

            return sum > multiply ? sum : multiply;
        }
    }