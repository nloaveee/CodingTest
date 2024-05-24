class Solution {
       boolean solution(String s){
           String answer = s.toLowerCase();
           int count = 0;
           
           for(int i = 0; i<answer.length(); i++){
               if (answer.charAt(i)=='p'){
                   count++;
               } else if (answer.charAt(i) == 'y'){
                   count--;
               }
           }
           
           if (count == 0){
               return true;
           } 
           return false;
       }
   }
   
   
    /*class Solution {
        boolean solution(String s) {

            String answer = s.toLowerCase();
            int countP = 0;
            int countY = 0;
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == 'p') {
                    countP++;
                }
                else if (answer.charAt(i) == 'y'){
                        countY++;
                }
            }
            
            if(countP == countY){
                return true;
            }
            return false;
        }
    }
     */