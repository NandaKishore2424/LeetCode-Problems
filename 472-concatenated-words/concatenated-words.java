import java.util.*;

public class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }

    TrieNode root = new TrieNode();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            if (canForm(word, 0, root, 0, new HashMap<>())) {
                result.add(word);
            }
            insert(word);
        }

        return result;
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }

    private boolean canForm(String word, int start, TrieNode node, int count, Map<Integer, Boolean> memo) {
        if (start == word.length()) return count >= 2;
        if (memo.containsKey(start)) return memo.get(start);

        TrieNode curr = node;
        for (int i = start; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                memo.put(start, false);
                return false;
            }
            curr = curr.children[idx];
            if (curr.isWord) {
                if (canForm(word, i + 1, node, count + 1, memo)) {
                    memo.put(start, true);
                    return true;
                }
            }
        }

        memo.put(start, false);
        return false;
    }
}
