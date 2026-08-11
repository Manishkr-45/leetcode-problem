class Solution {
public:
    set<vector<int>> s;
    void combSum(vector<int> &arr, int idx,int tar, vector<vector<int>> & ans, vector<int> &combination){
        if(idx == arr.size() || tar<0){
            return;
        
        }
        if(tar == 0){
            if(s.find(combination) == s.end()){
                ans.push_back(combination);
                s.insert(combination);
                
            }
            return;
        }
        combination.push_back(arr[idx]);
        //single
        combSum(arr,idx+1,tar-arr[idx], ans,combination);
        //multiple
        combSum(arr,idx,tar-arr[idx], ans,combination);
        combination.pop_back();
        //exclusion
        combSum(arr,idx+1,tar, ans,combination);

    }

    vector<vector<int>> combinationSum(vector<int>& arr, int target) {
        vector<vector<int>> ans;
        vector<int> combination;
        combSum(arr,0,target,ans,combination);
        return ans;

        
    }
};