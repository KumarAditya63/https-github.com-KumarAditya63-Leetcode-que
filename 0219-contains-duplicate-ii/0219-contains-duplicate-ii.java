class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          HashSet<Integer> set = new HashSet<>();
           
          for(int i = 0;i<nums.length;i++){
             if (k == 0) return false;

             if (set.contains(nums[i])) {
                return true;
            }
            if (set.size() >= k) {
                set.remove(nums[i - k]);
            }
            set.add(nums[i]);
          }
        return false;
    }
}