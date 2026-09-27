class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // Find the maximum pile size to set the upper bound for our binary search
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        
        // Binary search for the minimum eating speed
        while (left < right) {
            int mid = left + (right - left) / 2;
            long hoursSpent = 0;
            
            // Calculate total hours required at the current eating speed (mid)
            for (int pile : piles) {
                // Equivalent to Math.ceil((double) pile / mid) but avoids floating point inaccuracies 
                hoursSpent += (pile + mid - 1) / mid; 
            }
            
            if (hoursSpent <= h) {
                // If she can finish within h hours, try a slower speed
                right = mid;
            } else {
                // If she cannot finish, she needs to eat faster
                left = mid + 1;
            }
        }
        
        return left;
    }
}