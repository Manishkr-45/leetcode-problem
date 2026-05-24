#include <vector>

class Solution {
public:
    int findPeakElement(std::vector<int>& nums) {
        int left = 0;
        int right = nums.size() - 1;
        
        while (left < right) {
            // Prevent potential integer overflow
            int mid = left + (right - left) / 2;
            
            // If the slope is rising, a peak must be to the right
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } 
            // If the slope is falling, a peak must be to the left (or is mid)
            else {
                right = mid;
            }
        }
        
        return left;
    }
};