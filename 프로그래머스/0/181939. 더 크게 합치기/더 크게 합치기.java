class Solution {
    public int solution(int a, int b) {
        String x = Integer.toString(a)+Integer.toString(b);
        String y = Integer.toString(b)+Integer.toString(a);
        int a2 = Integer.parseInt(x);
        int b2 = Integer.parseInt(y);
        
        return (a2>b2)?a2: b2;
    }
}