class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder digits = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            digits.append(i);
        }

        return findKthPermutation(digits, k).toString();
    }

    private StringBuilder findKthPermutation(StringBuilder digits, int k) {
        if (k == 1 || k == 0) return digits;

        int factorial = 1;
        int blockSize = 0; 

        while (factorial < k) {
            blockSize++;
            factorial *= (blockSize + 1);
        }

        factorial /= (blockSize + 1);

        int groupEnd = factorial;
        int indexFromRight = blockSize;

        while (groupEnd < k) {
            indexFromRight--;
            groupEnd += factorial;
        }

        int indexToPick = digits.length() - 1 - indexFromRight;
        char selectedDigit = digits.charAt(indexToPick);

        digits.deleteCharAt(indexToPick);

        int newK = k - (groupEnd - factorial);

        if (digits.length() != blockSize) {
            String prefix = digits.substring(0, digits.length() - blockSize); // fixed left part
            StringBuilder remainingDigits = new StringBuilder(digits.substring(digits.length() - blockSize)); // part to permute

            return new StringBuilder(prefix)
                    .append(findKthPermutation(remainingDigits, newK).insert(0, selectedDigit));
        }

        return findKthPermutation(digits, newK).insert(0, selectedDigit);
    }
}