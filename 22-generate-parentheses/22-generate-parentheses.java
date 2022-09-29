class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        GP(n,0,0,"",list);
        return list;
    }
    public static void GP(int n,int open,int close,java.lang.String  ans,List<String> list)
	{
		if(open==n && close==n)
		{
			//System.out.println(ans);
			list.add(ans);
			return;
		}
		if(open<n)
		{
			GP(n,open+1,close,ans+"(",list);
		}
		if(close<open)
		{
			GP(n,open,close+1,ans+")",list);
		}
	}
}