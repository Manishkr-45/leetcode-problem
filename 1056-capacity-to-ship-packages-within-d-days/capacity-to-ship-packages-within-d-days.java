class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int st = 0;
        for(int i = 0; i<n; i++){
            st = Math.max(st,weights[i]);
        }
        int end = 0;
        for(int vals:weights){
            end+=vals;
        }
        while(st<end){
            int mid = st +(end-st)/2;
            int curr = 0;
            int day = 1;
            for(int vals:weights){
                if(curr+vals>mid){
                    day ++;
                    curr = vals;
                }
                else{
                    curr += vals;
                }
            }
            if(day<=days){
                end = mid;
            }
            else{
                st = mid +1;
            }

        }
        return st;
    }
}