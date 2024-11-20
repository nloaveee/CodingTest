import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(nums.length / 2, set.size());
        
//         Set<Integer> set = new HashSet<>();

//         for (int i = 0; i<nums.length; i++) {
//             set.add(nums[i]);
//         }
//         if (nums.length / 2 > set.size()) return set.size();

//         return nums.length / 2;
    }
}