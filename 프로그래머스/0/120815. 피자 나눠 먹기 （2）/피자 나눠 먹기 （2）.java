class Solution {
    public int solution(int n) {
        int i = 1;
        while ((n * i) % 6 != 0) {
            i++;
        }
        return (n * i) / 6;
    }
}
