class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive=new ArrayList<Integer>();
        List<Integer> negative=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else
            {
                negative.add(nums[i]);
            }
        }
        int[] result=new int[nums.length];
        int posindex=0,negindex=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0)
            {
                result[i]=positive.get(posindex++);
            }
            else
            {
                result[i]=negative.get(negindex++);
            }
        }
        return result;
    }
}