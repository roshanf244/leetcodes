class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }

        return Math.max(count, max);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum consecutive 1's: " + solution.findMaxConsecutiveOnes(nums));
    }
}
