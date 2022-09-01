class Solution {
    public boolean isUgly(int n) {
        if(n==1 ||n==2 || n==3 || n==5)
            return true;
        if(n<=0 || (n%2!=0 && n%3!=0 && n%5!=0)) return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if((n/i)%2!=0 && (n/i)%3!=0 && (n/i)%5!=0)
                    return false;
                 n/=i;
                 i--;
                
            }
        }
        return true;
    }
}