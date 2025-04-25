class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerAnswer = (numer1 * denom2) + (numer2 * denom1);
        int denomAnswer = denom1 * denom2;

        int gcd = getGcd(numerAnswer, denomAnswer);
        numerAnswer /= gcd;
        denomAnswer /= gcd;

        return new int[] {numerAnswer, denomAnswer};
    }

    private int getGcd(int x, int y) {
        while (y != 0) {
            int test = y;
            y = x % y;
            x = test;
        }
        return x;
    }
}
