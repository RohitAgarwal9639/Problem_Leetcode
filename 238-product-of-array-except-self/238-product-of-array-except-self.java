class Solution {
    public int[] productExceptSelf(int[] nums) {
        //maintain left array by multiply left elements except itself
        int[] left=new int[nums.length];
        //maintain right array by multiply right elements except itself
        int[] right=new int[nums.length];
        //initialize first element of left array as 1
        left[0]=1;
        //initialize last element of right array as 1
        right[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<right.length;i++)
        {
            left[i]=left[i]*right[i];
        }
        return left;
    }
}