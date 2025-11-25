class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        nanda(nums, 0, nums.length-1); //- step 1 rotate whole array -- 0, n-1
        nanda(nums, 0, k-1);           //- step 2 rotate first k elements - 0, k-1
        nanda(nums, k, nums.length-1); //- step 3 rotate remaining  k, n-1
    }
    private void nanda(int[] nums, int start, int last){
        while(start<last){ //O(N)
            int temp=nums[start];
            nums[start]=nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
}
/*n=7 n-1=6
k-1 = 2
1234567 - arr
0123456 - index

7654321 - step1
5674321 - sep2
5671234 step3 


1 2 3 4 5 6 7 - ip
k = 3

step 1 - reverse whole array - 7 6 5 4 3 2 1 
step 2- reverse first k number - 5 6 7 4 3 2 1
step 3 - reverse remaining - 5 6 7 1 2 3 4 

5 6 7 1 2 3 4  - op

array len = 7
k = 12
k=k%7 = 12% 7 = 5 = k
step 1: reverse 
*/
