class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int piv = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                piv = i;
                break;
            }
        }
        if(piv>=0){
            int j = n-1;
            while(nums[j]<=nums[piv]){
                j--;
            }
            swap(nums,piv,j);
        }
        reverse(nums,piv+1,n-1);
    }
    public void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int nums[], int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}