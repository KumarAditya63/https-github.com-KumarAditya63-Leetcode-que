class Solution {
    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int l = j + 1; l < nums.length; l++) {
                    if(nums[i]+nums[j] > nums[l]){
                        count++;
                    }


            
                }
            }
        }
        return count;
    }
        
        
}
