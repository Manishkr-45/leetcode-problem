class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        // int i =0;
        // while(i<chars.length){
        //     char ch = chars[i];
        //     int count = 0;
        //     while(i<chars.length && chars[i] == ch){
        //         count++;
        //         i++;
        //     }
        //     sb.append(ch);
        //     if(count>1){
        //         sb.append(count);
        //     }
        // }
        // for(int j =0; j<sb.length(); j++){
        //     chars[j] = sb.charAt(j);
        // }
        // return sb.length();
        int count = 1;
        for(int i = 1; i<=chars.length; i++){
            
            if(i<chars.length && chars[i] == chars[i-1]){
                count++;
            }else{
                sb.append(chars[i-1]);
                if(count>1){
                    sb.append(count);
                }
                count = 1;
            }      
        }
        for(int i = 0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
        
    }
}