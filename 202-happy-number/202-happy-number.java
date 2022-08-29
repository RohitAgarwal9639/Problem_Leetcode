class Solution {
    public boolean isHappy(int n) {
        //initialize sum as 0 to check if we get result as 1 or not
        int sum=0;
        int ans=n;
        while(true)
        {
            sum=0;
            //Loop to calculate sum of square of digit
            while(ans!=0)
            {
                int r=ans%10;
                sum+=r*r;
                ans=ans/10;
            }
            ans=sum;
            //if sum containg single digit break the loop
            if(sum>=1 && sum<=9)
                break;
        }
        // only this case we get true otherwise false
        if(sum==1 || sum == 7) 
                return true;
         return false;
    }
}