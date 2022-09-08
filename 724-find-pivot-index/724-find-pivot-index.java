class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftS=new int[nums.length];
        int[] rightS=new int[nums.length];
        leftS[0]=0;
        rightS[nums.length-1]=0;
        for(int i=1;i<nums.length;i++)
        {
            leftS[i]=leftS[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightS[i]=rightS[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(leftS[i]==rightS[i])
                return i;
        }
        return -1;
    }
}