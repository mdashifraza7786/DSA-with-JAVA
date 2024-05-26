class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the largest index i such that nums[i] < nums[i+1]
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        // If no such index exists, reverse the whole array
        if(i<0){
            reverseArray(nums,0,n-1);
            return;
        }

        // Find the largest index j greater than i such that nums[j] > nums[i]
        int j = n-1;
        while(nums[j] <= nums[i]){
            j--;
        }

        swap(nums,i,j);
        reverseArray(nums,i+1,n-1);
        
    }

    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverseArray(int[] nums, int start, int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
        
}