class Solution {
    int c=0;
    public int countSubstrings(String str) {
        for(int i=0;i<str.length();i++)
        {
            cp(str,i,i);
            cp(str,i,i+1);
        }
        return c;
    }
    public void cp(String str,int i,int j)
    {
        while(i>=0 && j<=str.length()-1 && str.charAt(i)==str.charAt(j))
        {
            c++;
            i--;
            j++;
        }
    }
}