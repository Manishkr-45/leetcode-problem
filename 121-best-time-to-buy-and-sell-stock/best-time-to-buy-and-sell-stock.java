class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int best = nums[0];
        int mp = 0;
        for(int i = 1; i<n; i++){
            
            if(nums[i]>best){
                
                mp = Math.max(mp,(nums[i]-best));
            }
            best = Math.min(best,nums[i]);
            

        }
        return mp;

        
    }
}