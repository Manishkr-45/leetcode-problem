class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int st = 0;
        for(int vals:weights){
            st = Math.max(vals,st);
        }
        int end = 0;
        for(int vals:weights){
            end+=vals;
        }
        while(st<end){
            int mid = st+(end-st)/2;
            int curr = 0;
            int d = 1;
            for(int vals:weights){
                if(vals+curr>mid){
                    curr = vals;
                    d++;
                }
                else{
                    curr+=vals;
                }
            }
            if(d<=days){
                end = mid;
            }
            else{
                st = mid+1;
            }

        }
        return st;
        
    }
}