class Solution {
    public int diagonalSum(int[][] mat) {
        int n= mat.length;
        int result = 0;
        for (int i = 0; i <n; i++) {
            result=result+mat[i][i];
            int c= n-i-1;
            if(i!=c) result=result+mat[i][c];
        }
        return result;
    }
}