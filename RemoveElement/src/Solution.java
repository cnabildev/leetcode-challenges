class Solution {
    // create main function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = solution.removeElement(nums, val);
        System.out.println(result);
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                // print  nums[k] = nums[i];
                System.out.println("nums[" + k + "]" + "=" + "nums[" + i + "]");
                k++;
            }
        }
        // Print the array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        return k;

    }
}