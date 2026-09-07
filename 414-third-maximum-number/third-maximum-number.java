class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for(int n : nums){
            store.add(n);
        }
        List<Integer> arr = new ArrayList<>(store);
        Collections.sort(arr);

        int n = arr.size();
        if(n <3){
            return arr.get(n-1);
        }
        return arr.get(n-3);
    }
}