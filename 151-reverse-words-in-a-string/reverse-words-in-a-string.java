class Solution {
    public String reverseWords(String s) {
        
        int st = 0;
        int end = s.length()-1;
        while(st<=s.length() && s.charAt(st)==' '){
            st++;
        }
        while(end>=0 && s.charAt(end)==' '){
            end--;
        }
        StringBuilder sb = new StringBuilder();
        while(st<=end){
            if(s.charAt(st)!=' '){
                sb.append(s.charAt(st));
            }else if(sb.charAt(sb.length()-1) != ' '){
                sb.append(s.charAt(st));
            }
            st++;
        }
        int i =0; 
        int j = sb.length()-1;
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;

        }
        int l = 0;
        int r = 0;
        while(l<sb.length()){
            while(r <sb.length() && sb.charAt(r) !=' '){
                r++;
            }
            i = l;
            j = r-1;
            while(i<j){
                char temp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
            l = r+1;
            r++;
        }
        return sb.toString();


        
    }
}