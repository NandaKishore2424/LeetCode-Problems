public class Solution {
    public boolean hasMatch(String s, String p) {
        String[] parts = p.split("\\*", -1);
        String prefix = parts[0];
        String suffix = parts[1];

        int minLen = prefix.length() + suffix.length();

        for (int i = 0; i <= s.length() - minLen; i++) {
            for (int j = i + minLen; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.startsWith(prefix) && sub.endsWith(suffix)) {
                    return true;
                }
            }
        }

        return false;
    }
}
