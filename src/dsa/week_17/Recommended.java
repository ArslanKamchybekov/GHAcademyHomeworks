package dsa.week_17;

class Solution {
    public int findKthNumber(int m, int n, int k) {
        int start = 1, end = n * m;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (helper(m, n, mid) >= k) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
    public int helper(int m, int n, int target) {
        int sumLessThanTarget = 0;
        for(int i = 1; i <= m; i++) sumLessThanTarget += Math.min(target / i, n);
        return sumLessThanTarget;
    }
}