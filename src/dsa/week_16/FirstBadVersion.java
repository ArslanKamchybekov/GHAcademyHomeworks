package dsa.week_16;

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
//[1, 2, 3, 4, 5, 6, 7] b = 6