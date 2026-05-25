class Solution {
    public String solution(String my_string, int n) {
        int length=my_string.length();
        String str="";
        for(int i=0; i<length; i++){
            for(int j=0; j<n; j++){
                str+=my_string.charAt(i);
            }
        }
        return str;
    }
}