class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        int idx = 0;
        for(int ele : nums) arr[idx++] = ele + "";
        
        Arrays.sort(arr, (a, b)-> {
            long s1 = Long.parseLong(a+b);
            long s2 = Long.parseLong(b+a);
            if(s1>s2) return 1;
            else if(s1<s2) return -1;
            else return 0;
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        } 
        
        if(sb.charAt(0) == '0') return "0";
        
        return sb.toString();
    }
}