class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> arr = new ArrayList<>();
            arr.add(1);
            if(i>0){
                List<Integer> prev = ans.get(i-1);
                for(int j = 1; j<i; j++){
                    arr.add(prev.get(j-1) + prev.get(j));
                }
                arr.add(1);
            }

            

            ans.add(arr);
        }
        return ans;
        
    }
}