class Solution {
    public int findKthPositive(int[] arr, int k) {

        int st = 0;
        int end = arr.length;

        while (st < end) {

            int mid = st + (end - st) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return k + st;
    }
}