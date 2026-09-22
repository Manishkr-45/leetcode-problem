class Solution {
    public int maxArea(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n-1;
        int area = 1;
        int ans = Integer.MIN_VALUE;
        while(st<end){
            int b = end - st;
            int len = Math.min(nums[st],nums[end]);
            if(nums[st]<nums[end]){
            area = len * b;
            ans = Math.max(ans,area);
            st++;
            }else{
                area = len * b;
                ans = Math.max(ans,area);
                end--;
            }

        }
        return ans;
        
    }
}