public class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> res = new ArrayList<>();
        Set<String> dict = new HashSet<>(Arrays.asList(words));

        for (String word : words) {
            if (canForm(word, dict, new HashMap<>())) {
                res.add(word);
            }
        }

        return res;
    }

    private boolean canForm(String word, Set<String> dict, Map<String, Boolean> memo) {
        if (memo.containsKey(word)) return memo.get(word);

        for (int i = 1; i < word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (dict.contains(prefix) && 
                (dict.contains(suffix) || canForm(suffix, dict, memo))) {
                memo.put(word, true);
                return true;
            }
        }

        memo.put(word, false);
        return false;
    }
}
