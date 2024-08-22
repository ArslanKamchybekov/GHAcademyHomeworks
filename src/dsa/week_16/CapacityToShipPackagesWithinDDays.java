package dsa.week_16;

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

