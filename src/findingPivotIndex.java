/**
 * Given an array of integers, return the index such that the sum of the integers on the left is equal to the sum of the integers on the right.
 * If no index exists, return -1. If there are multiple indexes that exist, return the left-most one.
 *
 * Example 1:
 *
 * Input:
 * nums = [1, 7, 3, 6, 5, 6]
 * Output: 3
 * Explanation:
 * The sum of the integers on the left of index 3 is equal to the sum of integers on the right of index 3.
 *
 *
 * Example 2:
 *
 * Input:
 * nums = [1, 2, 3]
 * Output: -1
 * Explanation:
 * No index exists that can satisfy the problem statement.
 *
 *
 * Note:
 *
 * The size of the given array is in the range [0, 10000].
 * Each integer element in the array is in the range [-1000, 1000].
 */

public class findingPivotIndex {
    int[] nums;
    int pivotIndex = function(nums);

    private int function(int[] nums) {
        int right = 0;
        int left = 0;
        boolean indexExist = false;
        for(int i = 0; i < nums.length; i++){

            for (int j = 0; j < nums.length; j++){
                if (j < i) left = left + nums[j];
                if (j > i) right = right + nums[j];

            }
            if (left == right){
                return i;
            } else {
                left = 0;
                right = 0;
            }
        }
        return -1;
    }

};
