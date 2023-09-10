class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        int x=0;
        for(int i : nums)
        {
            if(i!=0)
            {
                ans[x]=i;
                x++;
            }
        }
        for(int i : nums)
        {
            if(i==0)
            {
                ans[x]=i;
                x++;
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=ans[i];
        }
    }
}
