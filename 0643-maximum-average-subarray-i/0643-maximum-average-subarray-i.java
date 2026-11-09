class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;

        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(i >= k-1){
                double cal = (double) sum / k;
                if(cal >max){
                    max = cal;
                }

            sum -=nums[i -k + 1];
            }
        }
        return max;

        
    }
}