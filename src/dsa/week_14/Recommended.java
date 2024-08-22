package dsa.week_14;

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int i, int end){
        while(i < end){
            int temp = nums[end];
            nums[end] = nums[i];
            nums[i] = temp;
            i++;
            end--;
        }
    }
}


class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for(int num : nums) count[num]++;

        int index = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < count[i]; j++){
                nums[index] = i;
                index++;
            }
        }
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j >= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}


class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1;
        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] % 2 == 0) i += 2;
            while(j < nums.length && nums[j] % 2 == 1) j += 2;
            if(i < nums.length && j < nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}


class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++) sum += this.nums[i];
        return sum;
    }
}
