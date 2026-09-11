class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int vals:nums){
            map.put(vals,map.getOrDefault(vals,0)+1);
        }
        for(int i = 0; i<n; i++){
            if(map.get(nums[i])>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}