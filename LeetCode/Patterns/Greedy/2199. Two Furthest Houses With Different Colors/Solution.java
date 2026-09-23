class Solution {
    public int maxDistance(int[] A) {
        int j = A.length;

        for (int i = 0; i < j; i++)
            if (A[i] != A[j - 1] || A[j - 1 - i] != A[0])
                return j - 1 - i;

        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna