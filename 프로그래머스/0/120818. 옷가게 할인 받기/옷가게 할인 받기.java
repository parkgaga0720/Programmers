class Solution {
    public int solution(int price) {
        int answer = 0;
        int sale = 0;
        if (500000 <= price) {
            sale = price * 80;
        } else if (300000 <= price && price < 500000) {
            sale = price * 90;
        } else if (100000 <= price && price < 300000) {
            sale = price * 95;
        } else {
            return price;
        }
        return answer = (sale / 100);
    }
}