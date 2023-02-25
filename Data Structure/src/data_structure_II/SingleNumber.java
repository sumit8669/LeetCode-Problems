package data_structure_II;

import java.util.HashMap;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashMap <Integer , Integer> hm  = new HashMap<>();

        for (int i = 0; i <nums.length ; i++) {
              hm.put(i,nums[i]);
        }


        return 0;
    }

}
