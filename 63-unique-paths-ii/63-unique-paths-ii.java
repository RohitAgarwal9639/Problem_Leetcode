class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length,n=arr[0].length;
        if(arr[0][0]==1) return 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                //first row and first column
                if(i==0 || j==0){
                    //if prev cell was obstacle or if current cell is obstacle
                    if(arr[i][j]==1 || (i!=0 && arr[i-1][0]==0) || (j!=0 && arr[i][j-1]==0) ){
                        arr[i][j]=0;
                    }
                    else{
                        arr[i][j]=1;
                    }
                }
                //all the other cell
                else{
                    if(arr[i][j]==1){
                     arr[i][j]=0;   
                    }
                    else{
                        arr[i][j]=arr[i-1][j]+arr[i][j-1];
                    }
                }
            }
        }
        return arr[m-1][n-1];
    }
}