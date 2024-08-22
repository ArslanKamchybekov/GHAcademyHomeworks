package dsa.week_18;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(nums[l] + nums[r] != target){
            if(nums[l] + nums[r] < target) l++;
            else r--;
        }
        return new int[]{l + 1, r + 1};
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int num: nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}

class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int index = 0;
        while(start < chars.length){
            char current = chars[start];
            int end = start;
            int count = 1;
            while(end + 1 < chars.length && chars[end + 1] == current){
                end++;
                count++;
            }

            chars[index] = current;
            index++;

            if(count > 1){
                char[] countChars = Integer.toString(count).toCharArray();
                for(char digit: countChars){
                    chars[index] = digit;
                    index++;
                }
            }
            start = end + 1;
        }
        return index;
    }
}


class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        int current;

        while(l <= r){
            current = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(current, res);
            if(height[r] >= height[l]) l++;
            else r--;
        }
        return res;
    }
}


