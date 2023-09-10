class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE; // maximum sum
        for (int j=0; j<nums.length; j++) {
            sum += nums[j];
            maxi = Math.max(maxi, sum);
            if (sum < 0 && j<nums.length-1) sum = 0;
        }
        return maxi;
    }
}
