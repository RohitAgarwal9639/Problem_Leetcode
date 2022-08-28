class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
        while(n!=0)
        {
            int a=n&1;
            if(a==1)
                c++;
            if(c>1)
                break;
            n>>=1;
        }
        if(c==1)
            return true;
        return false;
    }
}