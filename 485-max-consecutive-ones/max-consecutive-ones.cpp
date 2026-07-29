class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n = nums.size();
        int count = 0;
        int f = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]==1){
                count++;
                f= max(f,count);
            }
            else{
                count = 0;
            }
        }
      
        return f;
        
    }
};