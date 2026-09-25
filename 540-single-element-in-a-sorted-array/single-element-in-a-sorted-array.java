class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // Ensure mid is an even index so we are always checking the start of a potential pair
            if (mid % 2 != 0) {
                mid--;
            }
            
            // If the element at mid is equal to the next element, the single element is to the right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Otherwise, the single element is at mid or to the left
                right = mid;
            }
        }
        
        return nums[left];
    }
}