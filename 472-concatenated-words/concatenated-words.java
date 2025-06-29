class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) 
    {
        List <String> result = new ArrayList<>();
        Set <String>  wordSet = new HashSet<>(Arrays.asList(words));
        Arrays.sort(words,(a,b) -> a.length()- b.length());
        for(String word : words)
        {
            if(word.isEmpty()) continue;
            wordSet.remove(word);
            if(canFormDp(word,wordSet))
            {
                result.add(word);
            }
           wordSet.add(word);
        }
        return result;
    }
    private boolean canFormDp(String word, Set<String>  wordSet)
    {
        boolean[] dp = new boolean[word.length()+1];
        dp[0]  = true;
        for(int i=1; i<= word.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] && wordSet.contains(word.substring(j,i)))
                {
                 dp[i] = true;
                 break;
                }
            }
        }
        return dp[word.length()];
    }
    

}