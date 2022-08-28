class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==2  || n<=0) return false;
        if(n==1) return true;
        int b=4;
        int r=0;
        while(r!=1)
        {
            r=n/b;
            if(n%b!=0)
                return false;
            b=b*4;
        }
        return true;
    }
}