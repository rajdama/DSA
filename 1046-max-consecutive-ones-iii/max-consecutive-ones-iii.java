class Solution {
    public int longestOnes(int[] nums, int k) {
   int zeroCount = 0;
    int windowStart = 0;
    int windowEnd = 0;
    int max = 0;
    while(windowEnd<nums.length){
        if(nums[windowEnd] == 0 && zeroCount <= k){
            zeroCount++;
        }
            while(zeroCount > k){
                if(nums[windowStart]==0){
                    zeroCount--;
                }
                windowStart++;
            }
        max = Math.max(max,windowEnd-windowStart+1);
        windowEnd++;
    }
    return max;
    }
}