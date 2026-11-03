class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;                      // i pe even hai, sahi jagah
            } else if (nums[j] % 2 != 0) {
                j--;                      // j pe odd hai, sahi jagah
            } else {
                // i pe odd, j pe even -> swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }
}