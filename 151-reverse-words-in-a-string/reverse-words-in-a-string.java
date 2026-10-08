class Solution {
    public String reverseWords(String s) {
        String result[] = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = result.length;
        for(int i = n-1 ; i>=0; i--){
            sb.append(result[i]);
            if(i != 0){
                sb.append(' ');
            }

        }
        return sb.toString();
    }
}