class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0; i<=s2.length()-s1.length(); i++){
            int arr[] = new int[26];
            String sub = s2.substring(i,i+s1.length());
            for(int j = 0; j<sub.length(); j++){
                char ch = sub.charAt(j);
                arr[ch-'a']++;
            }
            if(Arrays.equals(freq,arr)){
                return true;
            }
        }
        return false;
        
    }
}