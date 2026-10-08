class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlen = strs[0].length();
        for(String str:strs){
            minlen = Math.min(str.length(),minlen);
        }
        int i =0;
        while(i<minlen){
            int j =0;
            while(j<strs.length-1){
                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
                    return strs[0].substring(0,i);
                }
                j++;


            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}