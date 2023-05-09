class Solution {

    public int removeDuplicates(int[] nums) {
        int ans = 1;
        for(int i = 1; i < nums.length; ++i)
            if(nums[i] != nums[i - 1])  {  
                nums[ans] = nums[i]; 
                ++ans; 
            }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 5, 5};
        Solution solution = new Solution();
        int len = solution.removeDuplicates(nums);
        System.out.println(nums);
    }
}