class Solution {
    // create main function
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {

        int index = 1;

        for (int i = 1; i < nums.length; i++) {

            // print index and i in the console
            System.out.println("index = " + index + ", i = " + i);

            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i];
                System.out.println("Replaced : " + nums[index] + " by " + nums[i]);
                index++;
                System.out.println("Increment index to " + index);
            }

            // print divider -----
            System.out.println("---------------------");
        }
        // Print the array
        for (int num : nums) {
            System.out.print(num + " ");
        }

        return index;
    }
}