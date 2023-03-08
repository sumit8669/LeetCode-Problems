package level1.prefixSum;

public class Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int lsum =0, rsum =sum;
        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];

            if (lsum == rsum) return i;
            lsum+=nums[i];
        }

        return -1;
    }
}
