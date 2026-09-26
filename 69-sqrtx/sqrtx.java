class Solution {
    public int mySqrt(int x) {
        int st = 0;
        int end = x;
        long ans = 0;
        while(st<=end){
            long mid = st+(end-st)/2;
            if(mid*mid == x){
                return (int)mid;
            }
            else if(mid*mid<x){
                ans = mid;
                st = (int)mid+1;
            }
            else{
                end = (int)mid-1;
            }
        }
        return (int)ans;

        
    }
}