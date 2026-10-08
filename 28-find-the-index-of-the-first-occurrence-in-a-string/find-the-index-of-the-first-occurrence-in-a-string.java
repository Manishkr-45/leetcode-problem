class Solution {
    public int strStr(String haystack, String needle) {
        int n= haystack.length();
        int m = needle.length();
        if(n<m){
            return -1;

        }
        for(int i = 0; i<n; i++){
            int j = 0;
            while(j<m && i+j<n){
                if(needle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;

        
    }
}