class Solution {
    public boolean solution(String s) {
        
        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        else return false;
        
        // if(s.length() != 4 && s.length() != 6) return false;
        // for (int i=0;i<s.length();i++) {
        //     if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        // }        
        // return true;
    }
}