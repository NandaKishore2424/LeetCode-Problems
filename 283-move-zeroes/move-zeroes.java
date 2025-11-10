class Solution {
    public void moveZeroes(int[] arr) {
        int point=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[point++]=arr[i];
            }
        }
        for(int i=point;i<arr.length;i++){
            arr[i]=0;
        }
    }
}