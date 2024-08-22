package dsa.week_16;

class Solution {
    public int mySqrt(int x) {
        int left = 0, right = x;
        int res = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;
            if(sq == x) return mid;
            else if (sq < x) {
                left = mid + 1;
                res = mid;
            }
            else right = mid - 1;
        }
        return res;
    }
}

//[1, 2, 3, 4, 5, 6, 7, 8, 9] x = 9
