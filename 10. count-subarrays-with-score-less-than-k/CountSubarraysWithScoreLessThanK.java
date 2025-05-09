public class CountSubarraysWithScoreLessThanK {
    // sliding window
    public long countSubarrays(int[] nums, long k) {
        int start = 0;
        int end = 0;
        long currSum = 0;
        long res = 0;

        while (end < nums.length) {
            currSum += nums[end];

            while (currSum * (end - start + 1) >= k) {
                currSum -= nums[start];
                start++;
            }

            res += (end - start + 1);
            end++;
        }

        return res;
    }
}