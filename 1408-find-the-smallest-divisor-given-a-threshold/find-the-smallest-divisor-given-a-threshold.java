class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int st = 1;
        int end = nums[0];

        for (int val : nums) {
            end = Math.max(end, val);
        }
        while(st<end){
            int mid = st+(end-st)/2;
            int sum = 0;
            for(int vals: nums){
                sum+= (vals + (mid-1))/mid;
            }
            if(sum<=threshold){
                end = mid;
            }else{
                st = mid+1;
            }
        }
        return st;
        
    }
}