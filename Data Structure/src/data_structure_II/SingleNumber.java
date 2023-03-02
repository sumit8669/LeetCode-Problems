/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.*/

package data_structure_II;

import java.util.*;

public class SingleNumber {


    // BEST APPROACH USING O(N) TIME AND O(1) SPACE
    public int singleNumberXOR(int[] nums) {
        //since XOR with 0 returns same number
        int ans=0;
        for(int i=0; i<nums.length; i++){
            // ans = (ans) XOR (array element at i)
            ans ^= nums[i];
        }
        return ans;
    }

    public int singleNumber2ForLoop(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
        }
        return 0;
    }
}
