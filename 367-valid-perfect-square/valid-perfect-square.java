class Solution {
    public boolean isPerfectSquare(int num) {
        long n = 1;

        while (n * n <= num) {
            if (n * n == num) return true;
            n++;
        }

        return false;
    }
}
