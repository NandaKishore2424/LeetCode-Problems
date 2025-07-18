class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstrowzero=false;
        boolean firstcolzero=false;
        //first row lets check for the zero
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstrowzero=true;
                break;
            }
        }
        //now lets check the col
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstcolzero=true;
                break;
            }
        }
        //mark what row and col has zero
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrowzero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcolzero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}