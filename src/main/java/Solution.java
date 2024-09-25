class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majorityCandidate = 0;

        for (int num: nums) {
            if (count == 0) majorityCandidate = num;

            count += num == majorityCandidate ? 1 : -1;
        }

        return majorityCandidate;
    }
}