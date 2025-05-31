class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            ans.add(generateRows(row));
        }
        return ans;
    }
    public static List<Integer> generateRows(int row){
        long ans=1;
        List<Integer> ansRows=new ArrayList<>();
        ansRows.add(1);
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            ansRows.add((int)ans);
        }
        return ansRows;
        
    }
}