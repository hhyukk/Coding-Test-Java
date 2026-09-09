class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        
        for(char a : my_string.toCharArray()){
            if(a == alp.charAt(0)){
                a = Character.toUpperCase(a);
            }
            sb.append(a);
        }
        return sb.toString();
    }
}