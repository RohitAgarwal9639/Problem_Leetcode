class Solution {
    public String reverseWords(String s) {
        String ans="";
        int i=0,j=0;
        while(j<=s.length()-1)
        {
            if(s.charAt(j)==' ')
            {
                for(int k=j-1;k>=i;k--)
                {
                    ans+=s.charAt(k);
                }
                ans+=" ";
                i=j+1;
            }
            j++;
            
        }
        for(int k=j-1;k>=i;k--)
        {
              ans+=s.charAt(k);
        }
        return ans;
    }
}