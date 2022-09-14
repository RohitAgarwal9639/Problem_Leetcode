class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p=1;
        int c=0;
        int si=0,ei=0;
        while(ei<nums.length)
        {
            p*=nums[ei];
            while(p>=k && si<=ei)
            {
                p=p/nums[si];
                si++;
            }
            c=c+ei-si+1;
            ei++;
        }
        return c;
    }
}