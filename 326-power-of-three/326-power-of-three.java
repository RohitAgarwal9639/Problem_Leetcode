class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0 || n==-1|| n==2 || n==-2 || n<0) return false;
        if(n==1) return true;
        int b=3;
        int r=0;
        while(r!=1)
        {
            r=n/b;
            if(n%b!=0)
                return false;
            b=b*3;
        }
        return true;
    }
}