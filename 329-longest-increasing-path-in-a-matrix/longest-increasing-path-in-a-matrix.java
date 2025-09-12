class Solution {
    private int dfs(
        int row,
        int col,
        int[][]mat,
        int [][]follow
        ){
            int n = mat.length;
            int m = mat[0].length;
            if(follow[row][col]!=0){
                return follow[row][col];
            }
            int[] delR = {-1, 0, 1, 0};
             int[] delC = {0, 1, 0, -1};
            int maxLen = 1;
            for(int i=0;i<4;i++){
                int nRow = row + delR[i];   
                int nCol = col + delC[i];

                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m
                && mat[nRow][nCol]>mat[row][col]){
                  int  len = 1 + dfs(nRow,nCol,mat,follow);
                    maxLen  = Math.max(maxLen,len);
            }
        }
        follow[row][col] = maxLen;
        return maxLen;
              }

    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
    
    int[][] follow =new int[n][m];
            int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans = Math.max(ans, dfs(i, j, matrix,follow));
            }
        }
        return ans;
    }   
}