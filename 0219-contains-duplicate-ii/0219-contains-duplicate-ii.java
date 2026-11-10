import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Step 1: Check duplicate
            if (set.contains(nums[i])) {
                return true;
            }

            // Step 2: Add current element
            set.add(nums[i]);

            // Step 3: Maintain window size
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}