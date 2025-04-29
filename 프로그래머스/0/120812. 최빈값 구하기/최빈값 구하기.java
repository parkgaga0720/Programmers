class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];

        for (int num : array) {
            count[num]++;
        }

        int max = 0;    
        int mode = 0;  
        boolean isDup = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                mode = i;
                isDup = false; 
            } else if (count[i] == max && count[i] != 0) {
                isDup = true; 
            }
        }

        return isDup ? -1 : mode;
    }
}
