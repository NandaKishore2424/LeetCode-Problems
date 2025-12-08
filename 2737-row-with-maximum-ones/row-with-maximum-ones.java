class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxones=0;
        int res[]=new int[2];
        for(int i=0;i<mat.length;i++){
            int currones=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    currones++;
                }
            }
            if(currones>maxones){
                maxones=currones;
                res[0]=i;
                res[1]=currones;
            }
        }
        return res;
    }
}