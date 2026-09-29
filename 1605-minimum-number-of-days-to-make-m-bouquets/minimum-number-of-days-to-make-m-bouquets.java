class Solution {
    public int canMake(int[] bloomDay, int mid,int k ){
        int bouqcount = 0;
        int count = 0;
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] <=mid){
                count++;
            }
            else{
                count = 0;
            }
            if(count == k){
                bouqcount++;
                count=0;
            }

        }
        return bouqcount;
    }
    public int minDays(int[] bloomDay, int m, int k) {
          int st = 1;
          int end = 0;
          for(int vals:bloomDay){
            end = Math.max(end,vals);
          }
          int mindays = -1;
          while(st<=end){
            int mid = st +(end-st)/2;
            if(canMake(bloomDay,mid,k)>=m){
                mindays = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
          }
          return mindays;
    }
}