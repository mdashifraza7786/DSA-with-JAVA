import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }
    
    private int maxSubArray(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        
        int mid = left + (right - left) / 2;
        
        int leftMax = maxSubArray(nums, left, mid);
        int rightMax = maxSubArray(nums, mid + 1, right);
        int crossingMax = maxCrossingSum(nums, left, mid, right);
        
        return Math.max(Math.max(leftMax, rightMax), crossingMax);
    }
    
    private int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }
        
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }
        
        return leftSum + rightSum;
    }
}
