class Solution {
public:
    int firstOccurence(vector<int>&nums, int target){
        int st = 0;
        int end = nums.size()-1;
        int ans = -1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(nums[mid]==target){
                ans= mid;
                end=mid -1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else {
                st = mid +1;
            }

        }
        return ans;
    }
    int lasstOccurence(vector<int>&nums, int target){
        int st = 0;
        int end = nums.size()-1;
        int ans = -1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(nums[mid]==target){
                ans= mid;
                st= mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else {
                st = mid +1;
            }

        }
        return ans;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = firstOccurence(nums,target);
        int last = lasstOccurence(nums,target);
        return {first,last};
       
        
        
    }
};