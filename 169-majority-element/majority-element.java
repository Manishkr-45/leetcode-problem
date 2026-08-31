class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
        
    }
}