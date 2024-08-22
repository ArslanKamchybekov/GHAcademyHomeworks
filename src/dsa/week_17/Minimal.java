package dsa.week_17;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end  = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}

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

class Solution {
    public int findMin(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = weights[0], r = 0;
        for(int w: weights) {
            l = Math.max(l, w);
            r += w;
        }

        int res = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (canShip(mid, weights, days)) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public boolean canShip(int capacity, int[] weights, int days) {
        int ships = 1, currentCapacity = capacity;
        for (int w : weights) {
            if (currentCapacity - w < 0) {
                ships++;
                currentCapacity = capacity;
            }
            currentCapacity -= w;
        }
        return ships <= days;
    }
}
