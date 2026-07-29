class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n-2][n-2];
        for (int i=0;i<n-2;i++)
            for (int j=0;j<n-2;j++)
                for (int k=0;k<3;k++)
                    for (int l=0;l<3;l++)
                        arr[i][j]=Math.max(arr[i][j], grid[i + k][j + l]);
        return arr;
    }
}