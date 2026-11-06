
class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int max = -1;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                if(nums[i] == -nums[j]) {

                    int currmax = Math.max(nums[i], nums[j]);

                    if(currmax > max) {
                        max = currmax;
                    }
                }
            }
        }

        return max;
    }
}
