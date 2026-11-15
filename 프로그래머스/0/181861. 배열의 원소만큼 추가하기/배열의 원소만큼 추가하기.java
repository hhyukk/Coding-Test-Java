import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:arr){
            for(int i=0; i<x; i++){
                list.add(x);
            }
        }
        return list.stream()
            .mapToInt(i->i)
            .toArray();
                
    }
}