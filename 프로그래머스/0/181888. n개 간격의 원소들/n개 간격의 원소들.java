import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        while(true){
            if(i>=num_list.length){
                break;
            }
            arr.add(num_list[i]);
            i+=n;
        }
        int[] answer = new int[arr.size()];
        for(int j=0; j<arr.size(); j++){
            answer[j]=arr.get(j);
        }
        return answer;
    }
}