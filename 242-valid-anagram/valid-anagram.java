class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        int arr[] = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;

        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            arr[ch-'a']++;  
        }
        if(Arrays.equals(freq,arr)){
            return true;
        }
        else{
            return false;
        }
        
    }
}