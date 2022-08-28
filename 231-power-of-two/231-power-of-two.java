class Solution {
    public boolean isPowerOfTwo(int n) {
        //initialize variable c for counting number of 1's in binary representation of n
        int c=0;
        while(n!=0)
        {
            int a=n&1;
            if(a==1)
                c++;
            // if c>1 means it can not be power of 2 so break
            if(c>1)
                break;
            //right shift number by 1 bit
            n>>=1;
        }
        if(c==1)
            return true;
        return false;
    }
}
