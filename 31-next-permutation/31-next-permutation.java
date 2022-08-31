class Solution {
    public void nextPermutation(int[] nums) {
        //find element which is smaller than its previous element from right
        int p=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                p=i;
                break;
            }
        }
        int q=0;
        for(int i=nums.length-1;i>p;i--)
        {
            if(nums[i]>nums[p])
            {
                q=i;
                break;
            }
        }
        if(p==0 && q==0)
        {
            Range_reverse(nums,0,nums.length-1);
            return;
        }
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
        Range_reverse(nums,p+1,nums.length-1);
    }
    public static void Range_reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
    
}