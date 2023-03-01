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
