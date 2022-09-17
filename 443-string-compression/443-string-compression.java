class Solution {
    public int compress(char[] chars) {
        String str="";
        int c=1;
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i-1]==chars[i])
            {
                c++;
            }
            else
            {
                str=str+chars[i-1];
                if(c!=1)
                {
                    str=str+c;
                }
                c=1;
            }
        }
        str=str+chars[chars.length-1];
        if(c!=1)
        {
            str=str+c;
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}