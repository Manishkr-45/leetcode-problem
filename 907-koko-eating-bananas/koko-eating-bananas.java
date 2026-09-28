class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int end = 0;
        for(int i =0; i<n ; i++){
            end = Math.max(end,piles[i]);
        }
        int st = 1;
        while(st<end){
            int mid = st + (end-st)/2;
            int hours = 0;
            for(int pile : piles){
                hours += (pile+mid-1)/mid; 
            }
            if(hours<=h){
                end = mid;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
}