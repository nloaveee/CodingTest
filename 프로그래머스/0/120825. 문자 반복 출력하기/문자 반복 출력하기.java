class Solution {
        public String solution(String my_string, int n) {
           String answer = "";
            char[] my_string_char = new char[my_string.length()];
            for(int i=0 ; i<my_string.length(); i++){
                my_string_char[i]=my_string.charAt(i);
                for (int j=0; j<n; j++){
                    answer+= String.valueOf(my_string_char[i]);
                }
            }

            return answer;
        }
    }
