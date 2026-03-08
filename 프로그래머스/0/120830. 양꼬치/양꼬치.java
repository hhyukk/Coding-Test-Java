class Solution {
    public int solution(int n, int k) {
        int sum =n*12000 + k*2000;
        sum-=(n/10)*2000;
        return sum;
    }
}