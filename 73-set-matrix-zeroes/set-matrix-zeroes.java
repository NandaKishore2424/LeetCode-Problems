class Solution {
    public void setZeroes(int[][] nums) {
        boolean firstrowzero=false;
        boolean firstcolzero=false;
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<n;i++){
            if(nums[0][i]==0){
                firstrowzero=true;
                break;
            }
        }
        for(int i=0;i<m;i++){
            if(nums[i][0]==0){
                firstcolzero=true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(nums[i][j]==0){
                    nums[i][0]=0;
                    nums[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(nums[i][0] == 0 || nums[0][j]==0){
                    nums[i][j]=0;
                }
            }
        }
        if(firstrowzero){
            for(int i=0;i<n;i++){
                nums[0][i]=0;
            }
        }
        if(firstcolzero){
            for(int i=0;i<m;i++){
                nums[i][0]=0;
            }
        }
    }
}