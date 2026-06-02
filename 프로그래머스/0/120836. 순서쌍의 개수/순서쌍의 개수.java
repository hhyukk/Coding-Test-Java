class Solution {
    public int solution(int n) {
        int i=1;
        int count=0;
        while(true){
            if(n%i==0){
                count++;
                if(i==n/i) return count*2-1;
                if(i>n/i) return (count-1)*2;
            }
            i++;
        }
    }
}