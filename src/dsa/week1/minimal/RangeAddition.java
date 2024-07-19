package dsa.week1.minimal;

class Solution {
    public int[] getModifiedArray(int length, int[][] updates){
        int[] res = new int[length];
        for(int[] update: updates){
            int start = update[0], end = update[1], val = update[3];

            res[start] += val;
            if(end + 1 < length) res[end + 1] -= val;
        }
        for(int i = 1; i < res.length; i++) res[i] += res[i - 1];
        return res;
    }
}
