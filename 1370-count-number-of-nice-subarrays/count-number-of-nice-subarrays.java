class Solution {
    static int lessThanEquals(int[] a, int k) {
        if(k<0) return 0;
        int sum = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        while(right<a.length){
            sum = sum + a[right]%2;
            while(sum > k){
                sum = sum - a[left]%2;
                left++;
            }
            count = count + right - left + 1;
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] a, int k) {
        return lessThanEquals(a,k) - lessThanEquals(a,k-1);
    }
}