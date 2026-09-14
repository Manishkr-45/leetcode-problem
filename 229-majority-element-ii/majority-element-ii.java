class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int vals: nums){
            set.put(vals,set.getOrDefault(vals,0)+1);
        }
        for(int vals: set.keySet()){
            if(set.get(vals)>n/3){
                arr.add(vals);
            }
        }
        return arr;
        
    }
}