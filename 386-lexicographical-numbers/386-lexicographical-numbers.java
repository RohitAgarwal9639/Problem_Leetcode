class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<Integer>();
        LexicoC(0,n,list);
        return list;
    }
    public static void LexicoC(int curr,int n, List<Integer> list)
	{
		if(curr>n)
		{
			return;
		}
        if(curr!=0)
        {
            list.add(curr);   
        }
		int i=0;
		if(curr==0)
		{
			i=1;
		}
		for(;i<=9;i++)
		{
			LexicoC(curr*10+i,n,list);
		}
    }
}