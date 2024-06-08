import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor != 0) {
                    continue;
                }
                else if (arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
            Collections.sort(list);
            if (list.isEmpty()){
                list.add(-1);
            }
            return list;
    }
}