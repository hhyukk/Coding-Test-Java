class Solution {
    public String[] solution(String[] strArr) {
        int size=strArr.length;
        String[] answer = new String[size];
        
        
        for(int i=0; i<size; i++){
            if(i%2==0){
                answer[i]=strArr[i].toLowerCase();
            }
            else{
                answer[i]=strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}