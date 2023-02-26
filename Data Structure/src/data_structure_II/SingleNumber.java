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

    public int singleNumberArray(int[] nums) {
        ArrayList<Integer> set = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return set.iterator().next();
    }
}
