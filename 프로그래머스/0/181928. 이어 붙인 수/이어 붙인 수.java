class Solution {
    public int solution(int[] num_list) {
        String answer_even = "";
        String answer_odd = "";
        int answer = 0;
        for(int n:num_list){
            if(n%2==0) answer_even+=Integer.toString(n);
            else answer_odd+=Integer.toString(n);
        }
        answer = Integer.parseInt(answer_even) + Integer.parseInt(answer_odd);
        return answer;
    }
}