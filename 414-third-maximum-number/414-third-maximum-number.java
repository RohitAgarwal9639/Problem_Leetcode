class Solution {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(first<nums[i])
            {
                third=second;
                second=first;
                first=nums[i];
            }
            else if(second<nums[i] && first>nums[i])
            {
                third=second;
                second=nums[i];
            }
            else if(third<nums[i] && second>nums[i])
            {
                third=nums[i];
            }
        }
        return (int)(third==Long.MIN_VALUE?first:third);
    }
}