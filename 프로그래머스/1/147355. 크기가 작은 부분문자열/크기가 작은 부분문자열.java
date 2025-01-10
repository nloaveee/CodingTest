class Solution {
    public int solution(String t, String p) {
        int plength = p.length();
        long pnum = Long.parseLong(p);

        int count = 0;
        for (int i = 0; i <= t.length() - plength; i++) {
            long num = Long.parseLong(t.substring(i, i + plength));
            if (num <= pnum) {
                count++;
            }
        }

        return count;
    }
}