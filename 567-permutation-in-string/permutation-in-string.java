class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int freq[] = new int[26];
        int win[] = new int[26];
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
            win[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq,win)){
            return true;
        }
        for(int i = s1.length(); i<s2.length(); i++){
            win[s2.charAt(i)-'a']++;
            win[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(freq,win)){
                return true;
            }
        }
        return false;
        
    }
}