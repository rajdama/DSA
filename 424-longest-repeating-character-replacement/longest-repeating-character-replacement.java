class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int high = 0;
        int[] arr = new int[26];
        int max = 0;
        int maxf = 0;
        while(high<s.length()){
            arr[s.charAt(high)-'A']++;
             maxf = Math.max(maxf, arr[s.charAt(high)-'A']);
            int changes = high - low + 1 - maxf;
            while(changes > k){
                 arr[s.charAt(low)-'A']--;
                changes--;
                low++;
            }
            max = Math.max(max,high - low + 1);
            high++;
        }
        return max;
    }
}