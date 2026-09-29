class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x = (int)n*(n+1)/2;
        int sum = 0;
        for(int vals:nums){
            sum+=vals;
        }
        return x-sum;
        
    }
}