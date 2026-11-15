class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length -n+1;
        int[] answer = new int[size];
        
        for(int i=n-1; i<num_list.length; i++){
            answer[i-(n-1)]=num_list[i];
        }
        System.out.println(size);
        return answer;
    }
}